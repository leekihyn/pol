package com.test.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.common.DBConn;
import com.test.dto.Goods;
import com.test.dto.Page;
import com.test.dto.Vendor;
 
public class VendorService { 
	  
	public List<Vendor> selectVendorsList(Vendor vs){ 
		Connection con = null;  
		PreparedStatement ps = null;   
		try {
			String sql = "select * from vendor_info where 1=1";
			if(vs.getViName()!=null){
				sql += " and viname like ?";
			}
			con = DBConn.getCon();
			ps = con.prepareStatement(sql);
			if(vs.getViName()!=null){
				ps.setString(1,  "%" + vs.getViName() + "%");
			}
			ResultSet rs = ps.executeQuery();
			List<Vendor> vendorList = new ArrayList<Vendor>();
			while(rs.next()){
				Vendor vendor = new Vendor();
				vendor.setViNum(rs.getInt("vinum"));
				vendor.setViName(rs.getString("viname")); 
				vendor.setViDesc(rs.getString("videsc"));  
				vendor.setViAddress(rs.getString("viaddress"));
				vendor.setViPhone(rs.getString("viphone")); 
				vendorList.add(vendor);
			} 
			return vendorList;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DBConn.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		return null;
	}
//
	public Vendor selectVendorsView(Vendor vs){ 
		Connection con = null;  
		PreparedStatement ps = null;   
		try {
			con = DBConn.getCon();
			String sql = "select * from vendor_info";
			sql += " where vinum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, vs.getViNum());
			ResultSet rs = ps.executeQuery();
			Vendor vendor = new Vendor();
			while(rs.next()){
				vendor.setViNum(rs.getInt("vinum"));
				vendor.setViName(rs.getString("viname")); 
				vendor.setViDesc(rs.getString("videsc"));  
				vendor.setViAddress(rs.getString("viaddress"));
				vendor.setViPhone(rs.getString("viphone")); 
			} 
			return vendor;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DBConn.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		return null;
	}	
	public List<Goods> selectVendorList(Goods pVendors){
		Connection con = null;
		PreparedStatement ps = null;
		try {
			String sql = "select gi.ginum, gi.giname, gi.gidesc, vi.vinum, vi.viname "
					+ " from goods_info as gi, vendor_info as vi "
					+ " where gi.vinum=vi.vinum";
			
			int idx=0;
			if(pVendors.getViNum()!=0){
				sql += " and gi.vinum=?";
				idx++;
			}
			if(pVendors.getViName()!=null){
				sql += " and gi.giname like ?";
				idx++; 
			}
			sql += " order by gi.ginum";
			sql += " limit ?,?";
			Page page = pVendors.getPage();
			con = DBConn.getCon();
			ps = con.prepareStatement(sql);
			if(pVendors.getViNum()!=0 && pVendors.getGiName()==null){
				ps.setInt(1, pVendors.getViNum());
			}else if(pVendors.getGiName()!=null && pVendors.getViNum()==0){
				ps.setString(1, "%" + pVendors.getGiName() + "%");
			}else if(pVendors.getGiName()!=null && pVendors.getViNum()!=0 ){
				ps.setInt(1, pVendors.getViNum());
				ps.setString(2, "%" + pVendors.getGiName() + "%");
			}
			ps.setInt(++idx, page.getStartRow()); 
			ps.setInt(++idx, page.getRowCnt());
			ResultSet rs = ps.executeQuery();
			List<Goods> goodsList = new ArrayList<Goods>(); 
			while(rs.next()){
				Goods goods = new Goods();
				goods.setGiNum(rs.getInt("ginum"));
				goods.setGiName(rs.getString("giname"));
				goods.setGiDesc(rs.getString("gidesc"));
				goods.setViNum(rs.getInt("vinum"));
				goods.setViName(rs.getString("viname"));
				goodsList.add(goods);
			}
			return goodsList;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DBConn.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return null;
	}
	
	public int deleteVendors(Vendor pVendors){   
		Connection con = null;
		PreparedStatement ps = null; 
		try {
			String sql = "delete from vendor_info where  vinum=?"; 
			con = DBConn.getCon(); 
			ps = con.prepareStatement(sql);
			ps.setInt(1, pVendors.getViNum()); 
			int result = ps.executeUpdate();
			con.commit();
			return result;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DBConn.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	} 
	public int insertVendor(Vendor pVendor){ 
		Connection con = null; 
		PreparedStatement ps = null;
		try {
			String sql = "insert into vendor_info(viname, videsc, viaddress, viphone, vicredat, vicretim)";
			sql += " values(?,?,?,?,DATE_FORMAT(NOW(),'%Y%m%d'),DATE_FORMAT(NOW(),'%H%i%s'))";   
			con = DBConn.getCon();   
			ps = con.prepareStatement(sql); 
			ps.setString(1, pVendor.getViName());
			ps.setString(2, pVendor.getViDesc()); 
			ps.setString(3, pVendor.getViAddress());  
			ps.setString(4, pVendor.getViPhone());      
			int result = ps.executeUpdate(); 
			con.commit();
			return result;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DBConn.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	public int updateVendor(Vendor pvendor){
		Connection con = null;
		PreparedStatement ps = null;
		try {
			String sql = "update vendor_info";  
			sql += " set viname=?,";
			sql += " videsc=?,";
			sql += "  viaddress=?,";
			sql += "  viphone=?";
			sql += " where vinum=?";
			con = DBConn.getCon(); 
			ps = con.prepareStatement(sql);
			ps.setString(1, pvendor.getViName());
			ps.setString(2, pvendor.getViDesc());
			ps.setString(3, pvendor.getViAddress()); 
			ps.setString(4, pvendor.getViPhone());  
			ps.setInt(5, pvendor.getViNum());  
			int result = ps.executeUpdate();
			con.commit();
			return result;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DBConn.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public Goods selectGoods(Goods pGoods){
		Connection con = null;
		PreparedStatement ps = null;
		try {
			String sql = "select gi.ginum, gi.giname, gi.gidesc, vi.vinum, vi.viname "
					+ " from goods_info as gi, vendor_info as vi "
					+ " where gi.vinum=vi.vinum and gi.ginum=?";
			con = DBConn.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, pGoods.getGiNum());
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Goods goods = new Goods();
				goods.setGiNum(rs.getInt("ginum"));
				goods.setGiName(rs.getString("giname"));
				goods.setGiDesc(rs.getString("gidesc"));
				goods.setViNum(rs.getInt("vinum"));
				goods.setViName(rs.getString("viname"));
				return goods;
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				DBConn.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	public int getTotalCount(Vendor pGoods){
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBConn.getCon();
			String sql = "select count(1) from vendor_info";
			ps = con.prepareStatement(sql);		
 			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				return rs.getInt(1);
			} 
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace(); 
		}finally{
			try {
				ps.close();
				DBConn.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}