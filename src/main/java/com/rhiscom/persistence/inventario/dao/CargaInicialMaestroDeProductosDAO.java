package com.rhiscom.persistence.inventario.dao;

import com.rhiscom.persistence.inventario.common.OracleConnectionException;
import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.dao.ICargaInicialMaestroDeProductosDAO;
import com.rhiscom.persistence.inventario.entity.ConversionUnidadMedida;
import com.rhiscom.persistence.inventario.entity.Producto;
import com.rhiscom.persistence.inventario.entity.xxosi.ProductoXXOSI;
import com.rhiscom.persistence.inventario.util.HibernateUtil;
import com.rhiscom.persistence.inventario.util.OracleConnection;
import com.rhiscom.persistence.inventario.util.OracleConnectionInfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

//import org.apache.log4j.Logger;

public class CargaInicialMaestroDeProductosDAO implements
		ICargaInicialMaestroDeProductosDAO {

	@Override
	public void generarExtraccionDesdeVistaXXOSI()
			throws PersistenceExceptionInventario {
		// TODO Codigo feo de Freddy

		// Default data source connection parameters.
		String URL = "jdbc:oracle:thin:@128.1.175.138:1521:XE";
		String USER = "FARMASANITASFR";
		String PASS = "FARMASANITASFR";

		/**
		 * @param args
		 */

		// logger.info("Initializing Oracle JDBC Test application ...");
		OracleConnectionInfo oConnInfo = new OracleConnectionInfo(URL, USER,
				PASS);
		OracleConnection oConn = OracleConnection.getInstance();

		// Gets connection to data model.
		Connection conn = null;
		try {
			conn = oConn.getConnection(oConnInfo);
		} catch (OracleConnectionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String ENTITY_NAME = "IN_MA_PR";

		try {
			Statement statement = conn.createStatement();
			statement.executeQuery("INSERT INTO " + ENTITY_NAME
					+ " (IT_ID,IT_NA) VALUES ('111111113','FLAPA Treh')");

			// Close the connection resources.
			statement.close();

		} catch (SQLException e) {
			// logger.error("Problems executing SQL Query: " + e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductoXXOSI> leerProductosXXOSI()
			throws PersistenceExceptionInventario {

		// Default data source connection parameters.
		List<ProductoXXOSI> listadoProductosNuevos = new ArrayList<ProductoXXOSI>();
		Session session = HibernateUtil.getSessionFactoryXXOSI().openSession();

		// FAIL 1: Usando Criteria
		/*
		 * Criteria criteria = session.createCriteria(ProductoXXOSI.class);
		 * List<ProductoXXOSI> listaProductosNuevos = criteria.list();
		 */

		// FAIL 2: Usando HQL
		/*
		 * Query query = session.createQuery("from ProductoXXOSI"); list =
		 * query.list();
		 */

		// FAIL 3: Usando SQL simp

		listadoProductosNuevos = (List<ProductoXXOSI>) session.createQuery(
				"select v from ProductoXXOSI v where estado = 'N'").list();

		// HibernateUtil.getSessionFactoryXXOSI().close();

		session.close();
		return listadoProductosNuevos;

	}

	@Override
	public void crearProductos(List<ProductoXXOSI> listadoProductos)
			throws PersistenceExceptionInventario {

		// Default data source connection parameters.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Producto producto;
		ProductoXXOSI productoXXOSI;
		Iterator iterador = listadoProductos.listIterator();
		while (iterador.hasNext()) {
			producto = new Producto();
			productoXXOSI = new ProductoXXOSI();

			productoXXOSI = (ProductoXXOSI) iterador.next();

			producto.setItemId(productoXXOSI.getItemId());
			producto.setItemName(productoXXOSI.getItemName());
			producto.setItemDescription(productoXXOSI.getItemDescription());
			producto.setAlternativeItemId1(productoXXOSI
					.getAlternativeItemId1());
			producto.setAlternativeItemId2(productoXXOSI
					.getAlternativeItemId2());
			producto.setAlternativeItemId3(productoXXOSI
					.getAlternativeItemId3());
			producto.setAlternativeItemId4(productoXXOSI
					.getAlternativeItemId4());
			producto.setPriceEntryRequiredFlag(productoXXOSI
					.getPriceEntryRequiredFlag());
			producto.setDiscountableFlag(productoXXOSI.getDiscountableFlag());
			producto.setPromotionableFlag(productoXXOSI.getPromotionableFlag());
			producto.setAuthorizedForSaleFlag(productoXXOSI
					.getAuthorizedForSaleFlag());
			producto.setConsignationFlag(productoXXOSI.getConsignationFlag());
			producto.setTaxExemptCode(productoXXOSI.getTaxExemptCode());
			producto.setWeightOrUnitCountCode(productoXXOSI
					.getWeightOrUnitCountCode());
			producto.setUnitOfMeasureCode(productoXXOSI.getUnitOfMeasureCode());

			session.save(producto);
		}
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void actualizarProductos(List<ProductoXXOSI> listadoProductos)
			throws PersistenceExceptionInventario {

		// Default data source connection parameters.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		ProductoXXOSI productoXXOSI;
		Iterator iterador = listadoProductos.listIterator();
		while (iterador.hasNext()) {
			productoXXOSI = new ProductoXXOSI();
			productoXXOSI = (ProductoXXOSI) iterador.next();
			Query consulta = session
					.createQuery("update Producto set itemName = :itemName, itemDescription = :itemDescription"
							+ ",alternativeItemId1 = :alternativeItemId1, alternativeItemId2 = :alternativeItemId2, alternativeItemId3 = :alternativeItemId3, alternativeItemId4 = :alternativeItemId4"
							+ ",priceEntryRequiredFlag = :priceEntryRequiredFlag, discountableFlag = :discountableFlag, promotionableFlag = :promotionableFlag, authorizedForSaleFlag = :authorizedForSaleFlag"
							+ ",consignationFlag = :consignationFlag, taxExemptCode = :taxExemptCode, weightOrUnitCountCode = :weightOrUnitCountCode, unitOfMeasureCode = :unitOfMeasureCode"
							+ " where itemId = :itemId");
			consulta.setParameter("itemId", productoXXOSI.getItemId());
			consulta.setParameter("itemName", productoXXOSI.getItemName());
			consulta.setParameter("itemDescription",
					productoXXOSI.getUnitOfMeasureCode());
			consulta.setParameter("alternativeItemId1",
					productoXXOSI.getAlternativeItemId1());
			consulta.setParameter("alternativeItemId2",
					productoXXOSI.getAlternativeItemId2());
			consulta.setParameter("alternativeItemId3",
					productoXXOSI.getAlternativeItemId3());
			consulta.setParameter("alternativeItemId4",
					productoXXOSI.getAlternativeItemId4());
			consulta.setParameter("priceEntryRequiredFlag",
					productoXXOSI.getPriceEntryRequiredFlag());
			consulta.setParameter("discountableFlag",
					productoXXOSI.getDiscountableFlag());
			consulta.setParameter("promotionableFlag",
					productoXXOSI.getPromotionableFlag());
			consulta.setParameter("authorizedForSaleFlag",
					productoXXOSI.getAuthorizedForSaleFlag());
			consulta.setParameter("consignationFlag",
					productoXXOSI.getConsignationFlag());
			consulta.setParameter("taxExemptCode",
					productoXXOSI.getTaxExemptCode());
			consulta.setParameter("weightOrUnitCountCode",
					productoXXOSI.getWeightOrUnitCountCode());
			consulta.setParameter("unitOfMeasureCode",
					productoXXOSI.getUnitOfMeasureCode());

			int result = consulta.executeUpdate();
		}
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void actualizarEstadoProductosXXOSI(
			List<ProductoXXOSI> listadoProductos)
			throws PersistenceExceptionInventario {

		// Default data source connection parameters.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		// String itemId = "";

		ProductoXXOSI productoXXOSI;
		Iterator iterador = listadoProductos.listIterator();
		while (iterador.hasNext()) {
			productoXXOSI = new ProductoXXOSI();
			productoXXOSI = (ProductoXXOSI) iterador.next();
			// itemId += productoXXOSI.getItemId();
			Query consulta = session
					.createQuery("update ProductoXXOSI set estado = 'T' where itemId = '"
							+ productoXXOSI.getItemId() + "'");
			int result = consulta.executeUpdate();
			System.out.println(result);
		}
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<ProductoXXOSI> validadorDeExistentes(
			List<ProductoXXOSI> listadoProductos)
			throws PersistenceExceptionInventario {

		// Default data source connection parameters.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		List<ProductoXXOSI> listadoProductosNuevos = new ArrayList<ProductoXXOSI>();
		List<ProductoXXOSI> listadoProductosExistentes = new ArrayList<ProductoXXOSI>();
		ProductoXXOSI productoXXOSI;
		String stringIdProductos = "";
		List<String> listadoIdProductos;

		Iterator iterador = listadoProductos.listIterator();
		while (iterador.hasNext()) {
			productoXXOSI = new ProductoXXOSI();
			productoXXOSI = (ProductoXXOSI) iterador.next();
			stringIdProductos += "'" + productoXXOSI.getItemId() + "'";
			if (iterador.hasNext()) {
				stringIdProductos += ",";
			}
		}

		if (stringIdProductos.length() > 0) {
			// Se continua la ejecucion
			listadoIdProductos = (List<String>) session.createQuery(
					"select itemId from Producto where itemId in ("
							+ stringIdProductos + ") ").list();
			iterador = listadoProductos.listIterator();
			while (iterador.hasNext()) {
				productoXXOSI = new ProductoXXOSI();
				productoXXOSI = (ProductoXXOSI) iterador.next();
				for (int i = 0; i <= listadoIdProductos.size() - 1; i++) {
					System.out.println(listadoIdProductos.get(i) + "="
							+ productoXXOSI.getItemId());
					if (listadoIdProductos.get(i).equals(
							productoXXOSI.getItemId())) {
						listadoProductosExistentes.add(productoXXOSI);
					} else {
						listadoProductosNuevos.add(productoXXOSI);
					}
				}
			}

		} else {
			// No hay datos

		}

		Producto producto = new Producto();
		// ProductoXXOSI productoXXOSI = new ProductoXXOSI();

		return listadoProductos;
	}
}
