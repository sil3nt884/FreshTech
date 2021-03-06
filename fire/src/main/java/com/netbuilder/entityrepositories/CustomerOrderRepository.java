package com.netbuilder.entityrepositories;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.netbuilder.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.repository.CrudRepository;

/**
 * CustomerOrderRepository 
 * @author Ricky Luu
 *
 */


public interface  CustomerOrderRepository extends  CrudRepository<CustomerOrder , Integer> {

	
	
	

	public List<CustomerOrder> findByOrderID(Integer OrderID);
	
	/**
	 * Finds Orders by Customer Order ID
	 * 
	 * @param customerOrderID
	 * @return CustomerOrder
	 */

	public List<CustomerOrder> findByCustomerID(Integer customerID);
	/**
	 *  Finds CustomerOrder by Address
	 * @param address
	 * @return CustomerOrder
	 */
	public ArrayList<CustomerOrder> findByDeliveryAddress(Integer deliveryAddress);
	/**
	 * Finds CustomerOrder by Date
	 * @param dateofOrder
	 * @return ArrayList<CustomerOrder>
	 */
	public ArrayList<CustomerOrder> findByOrderDate(String orderDate);
	/**
	 * Find Customer Orders by Order Status
	 * @param status
	 * @return ArrayList<CustomerOrder>
	 */
	public ArrayList<CustomerOrder> findByCustomerOrderStatus(String customerOrderStatus);
	/**
	 * Finds Customers Order by total of order
	 * @param total
	 * @return ArrayList<CustomerOrder>
	 */
	public ArrayList<CustomerOrder> findByOrderTotal(float orderTotal);



}
