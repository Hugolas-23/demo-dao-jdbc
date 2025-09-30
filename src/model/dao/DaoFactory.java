package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	//forma do programa principal não conhecer a implementação, apenas a interface
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
		//retorna o tipo da interface, mas utilizando a implementação
	}

}
