import java.util.*;

public class CustomerService
{
    // This method returns the customer's loyalty points in sorted order
    public List<Integer> getListOfCustomersSortedByLoyaltyPoints()
    {

        Customer customer1=new Customer(1101,"Tara","Female",true,"Austin",123);
        Customer customer2= new Customer(5242,"Sam","Male",false,"Denver",112);
        Customer customer3=new Customer(8965,"Abbie","Female",false,"Chicago",345);
        Customer customer4=new Customer(3354,"Michelle","Female",false,"Portland",234);
        Customer customer5=new Customer(2212,"Mary","Female",true,"New Orleans",456);
        Customer customer6=new Customer(4542,"John","Male",false,"Seattle",265);
        Customer customer7= new Customer(1119,"Trevor","Male",false,"Boston",101);
        Customer[] arr={customer1,customer2,customer3,customer4,customer5,customer6,customer7};
        List<Customer>customerList1=Arrays.asList(arr);

        List<Integer> list=new ArrayList<>();
        List<String > list1=new ArrayList<>();

        LoyaltyPointComparator loyaltyPointComparator1=new LoyaltyPointComparator();

        Collections.sort(customerList1,loyaltyPointComparator1);
        Iterator iterator=customerList1.iterator();

        while (iterator.hasNext() )
        {
            Customer p= (Customer) iterator.next();
            list.add(p.getLoyaltyPoints()) ;
            // list.add(p.getCustomerName());
            list1.add(p.getCustomerName());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Sorted list of customers  according to loyalty points is");
        System.out.println();
        System.out.println(list1);

        return list ;
    }
    public static void main(String[] args)
    {
        CustomerService obj=new CustomerService();
        List<Integer> res= obj.getListOfCustomersSortedByLoyaltyPoints();
        System.out.println(res);
    }

}
