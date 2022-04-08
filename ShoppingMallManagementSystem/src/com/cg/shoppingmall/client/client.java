package com.cg.shoppingmall.client;



import com.cg.shoppingmall.entities.Employee;
import com.cg.shoppingmall.entities.Shop;
import com.cg.shoppingmall.entities.User;
import com.cg.shoppingmall.service.EmployeeServiceImpl;
import com.cg.shoppingmall.service.IEmployeeService;
import com.cg.shoppingmall.service.IShopService;
import com.cg.shoppingmall.service.IUserService;
import com.cg.shoppingmall.service.IUserServiceImpl;
import com.cg.shoppingmall.service.ShopServiceImpl;

public class client 
{
	public static void main(String[] args)
	{
	
		
		User user = new User();
		IUserService service = new IUserServiceImpl();
		user.setId(4);
		user.setName("bhagyashri");
		user.setType("normal");
		user.setPassword("kbc");
		
		service.addNewUser(user);
		System.out.println("new user Added");
	/*
		
		/*Item item=new Item();
		IItemService service1=new ItemServiceImpl();
		item.setId(1);
		item.setName("Mobile");
		item.setManufacturing("2021");
		item.setExpiry("2023");
		item.setCategory("2050");
		item.setPrice(25000);
		
		service1.addItem(item);
		System.out.println("new item Added");
		
		Customer cust=new Customer();
		cust.setId(3);
		cust.setName("Anu");
		//cust.setOrder_id("AMY1345");
		cust.setPhone("8104848845");
		cust.setEmail("manuaradhy45a98@gmail.com");
		ICustomerService ics=new ICustomerServiceImpl();
		ics.orderItem(cust);
		System.out.println(cust);
	
		Employee empl=new Employee();
		empl.setId(200);
		empl.setName("Saqlain");
		//empl.setDob(09-10-1997);
		empl.setSalary(100000);
		empl.setAddress("Newyork");
		empl.setDesignation("Developer");
		
		service1.addEmployee(empl);
		System.out.println("new employee Added");
		
	
		Shop shop=new Shop();
		 IShopService service = new ShopServiceImpl();
		 
		shop.setShopId(101);
		shop.setShopEmployeeId(null);
		shop.setShopName("Apple");
		//shop.setShopowner(shop"abc");
		service.addShop(shop);
		System.out.println("new shop Added");
		
		/*
		//Shop shop= new Shop();   //this is for employee table
		//shop
		
		//CRUD operation of order
				OrderDetails order=new OrderDetails();
				IOrderService service3= new IOrderServiceImpl();
				
				
				//create
				order.setId(1);
				order.setDateOfPurchase("01-03-2000");
				order.setTotal(20);
				order.setPaymentMode("cash");
				
				service1.addUser(order);
				System.out.println(" database created");*/
		
		/*
		 * Shop shop1 = new Shop(); // shop1.getitemid(); //this is for for item table
		 * // shop1.getname("abc");
		 * 
		 * Employee emp=new Employee(); emp.getId(); emp.getName(); emp.getDob();
		 * emp.getSalary(); emp.getAddress(); emp.getDesignation();
		 * //emp.shopEmployees();
		 * 
		 * Item item = new Item(); item.getId(); item.getItemName();
		 * item.getManufacturingDate(); item.getExpiry(); item.getPrice();
		 * //item.category(); missing
		 * 
		 * Shop.addEmployee("emp"); shop.addItem("item");
		 */
		//em.persist(shopEmployees);
		//emp.persist(item);
		
	//	System.out.println("Added shop along with two employees to database.");
		
		//em.getTransaction().commit();
	
		
		/*
		 * ICustomerService customerservice=new ICustomerServiceImpl();
		 * customerservice.cancelOrder(2);
		 */
	}
}