package com.netbuilder.entityrepositoriesimplementations.dummy;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.netbuilder.data.DummyData;
import com.netbuilder.entities.Address;
import com.netbuilder.entities.Customer;
import com.netbuilder.entityrepositories.CustomerRepository;

/**
 * 
 * @author Thomas Dudley
 *
 * This class is to implement the functionality of the Customer repository.
 */
@Repository
public class CustomerRepositoryDummy implements CustomerRepository
{
	
	private DummyData dummyData;
	

	@Override
	public List<Customer> findAll() 
	{
		List<Customer> customer = null;
		
		return customer;
	}

	public DummyData getDummyData() {
		return dummyData;
	}

	public void setDummyData(DummyData dummyData) {
		this.dummyData = dummyData;
	}

	@Override
	public List<Customer> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Customer> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() 
	{
		return dummyData.getEntityList(new Customer()).size();
	}

	@Override
	public void delete(Integer customerID) 
	{
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		for(int i = 0; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerID() == customerID)
			{
				customer.remove(i);
			}
		}
		
		dummyData.setEntityList(customer);
	}

	@Override
	public void delete(Customer arg0) {
		
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		for(Customer c : customer)
		{
			if(c.equals(arg0))
			{
				customer.remove(arg0);
			}
		}		
		
		dummyData.setEntityList(customer);
	}

	@Override
	public void delete(Iterable<? extends Customer> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		for(Customer c : customer)
		{
			customer.remove(c);
		}
		
		dummyData.setEntityList(customer);
	}

	@Override
	public boolean exists(Integer customerID) {
		
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		for(int i = 0; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerID() == customerID)
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Iterable<Customer> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Customer> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByCustomerID(int customerID) 
	{
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		Customer foundCustomer = new Customer();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerID() == customerID)
			{
				foundCustomer = customer.get(i);
				
				return foundCustomer;
			}
		}
		return null;
	}

	@Override
	public Customer findByCustomerPhone(String customerPhone) 
	{
		
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		ArrayList<Customer> foundCustomer = new ArrayList<Customer>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerPhone().equalsIgnoreCase(customerPhone))
			{
				foundCustomer.add(customer.get(i));
			}
		}
		
		return foundCustomer.get(0);
	}

	@Override
	public List<Customer> findByCustomerAvailableCredit(float availableCredit) 
	{
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		ArrayList<Customer> foundCustomer = new ArrayList<Customer>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getAvailableCredit() == availableCredit);
			{
				foundCustomer.add(customer.get(i));
			}
		}
		
		return foundCustomer;
	}

	@Override
	public List<Customer> findByCustomerName(String name) 
	{
		
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		ArrayList<Customer> foundCustomer = new ArrayList<Customer>();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerName().equalsIgnoreCase(name));
			{
				foundCustomer.add(customer.get(i));
			}
		}
		
		return foundCustomer;
	}

	@Override
	public Customer findByCustomerEmail(String customerEmail) 
	{
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		Customer foundCustomer = new Customer();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerEmail().equalsIgnoreCase(customerEmail));
			{
				foundCustomer = customer.get(i);			
			}
		}
		
		return foundCustomer;
		
	}

	@Override
	public Customer findByCustomerUsername(String customerUsername) 
	{
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
		
		Customer foundCustomer = new Customer();
		
		for (int i = 0 ; i < customer.size(); i++)
		{
			if(customer.get(i).getCustomerUsername().equalsIgnoreCase(customerUsername));
			{
				foundCustomer = customer.get(i);			
			}
		}
		
		return foundCustomer;
		
	}

	
	@Override
	public List<Customer> findByAddressArray(Address address) 
	{
		ArrayList<Customer> customer = dummyData.getEntityList(new Customer());
			
		ArrayList<Customer> foundCustomer = new ArrayList<Customer>();
		
		for(int i = 0; i < customer.size(); i++)
		{
			for(int j = 0; j < customer.get(i).getCustomerAddressArray().size(); j++)
			{
				if(address == customer.get(i).getCustomerAddressAt(j))
				{
					foundCustomer.add(customer.get(i));
				}
			}
		}
				
		return foundCustomer;
	}

}