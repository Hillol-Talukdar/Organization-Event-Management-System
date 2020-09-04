
package organizationeventmangementsystem;

/**
 *
 * @author Hillol Talukdar
 */
class DataTypes 
{
    int organaizationId, org_maxCapacity, org_contactNumber;
    String org_name, org_street, org_city, org_email;
    
    int serviceId;
    String ser_type,ser_fees;
    
    int staffId,st_contactNumber;
    String st_firstName,st_lastName,st_role,st_gender,st_nationalId,st_street,st_city ;
    
    int customerId,  cs_contactNumber;
    String cs_firstName, cs_lastName, cs_nationalId, cs_street, cs_city; 
    
    int reservationId;
    String res_dateOfReservation, res_dateOfEvent;
    
    int orderId, or_quantity;
    
    int foodMenuId, fm_price;
    String fm_foodName; 
           
    public DataTypes(int organaizationId , String org_name , String org_street, String  org_city , 
                            int org_maxCapacity , String org_email , int org_contactNumber)
    {
        this.organaizationId= organaizationId;
        this.org_name = org_name;
        this.org_street = org_street;
        this.org_city = org_city;
        this.org_maxCapacity  = org_maxCapacity;
        this.org_email = org_email;
        this.org_contactNumber = org_contactNumber;
    }
    
    public DataTypes(int serviceId , String ser_type , String ser_fees , int organaizationId)
    {
        this.serviceId = serviceId;
        this.ser_type = ser_type;
        this.ser_fees = ser_fees;
        this.organaizationId = organaizationId;
    }
    
    public DataTypes(int staffId,String st_firstName, String st_lastName, String st_role, String st_gender, String st_nationalId,
            String st_street ,String st_city , int  st_contactNumber , int organaizationId)
    {
        this.staffId = staffId;
        this.st_firstName = st_firstName;
        this.st_lastName = st_lastName;
        this.st_role = st_role;
        this.st_gender = st_gender;
        this.st_nationalId = st_nationalId;
        this.st_street = st_street;
        this.st_city = st_city;
        this.st_contactNumber = st_contactNumber;
        this.organaizationId = organaizationId;
    }
    
    
    public DataTypes(int customerId,String cs_firstName, String cs_lastName, String cs_nationalId, String cs_street,String cs_city , int cs_contactNumber)
    {
        this.customerId = customerId;
        this.cs_firstName = cs_firstName;
        this.cs_lastName = cs_lastName;
        this.cs_nationalId = cs_nationalId;
        this.cs_street = cs_street;
        this.cs_city = cs_city;
        this.cs_contactNumber = cs_contactNumber;
    }
    
    public DataTypes(int reservationId , String res_dateOfReservation, String res_dateOfEvent , int serviceId, int staffId , int customerId)
    {
        this.reservationId = reservationId;
        this.res_dateOfReservation = res_dateOfReservation;
        this.res_dateOfEvent = res_dateOfEvent;
        this.serviceId = serviceId;
        this.staffId = staffId;
        this.customerId = customerId;
    }
    
    public DataTypes(int foodMenuId, String fm_foodName, int fm_price)
    {
        this.foodMenuId = foodMenuId;
        this.fm_foodName = fm_foodName;
        this.fm_price = fm_price;
    }

    public DataTypes(int orderId, int or_quantity, int reservationId , int foodMenuId)
    {
        this.orderId = orderId;
        this.or_quantity = or_quantity;
        this.reservationId  = reservationId;
        this.foodMenuId = foodMenuId;
    }
    
    public int getOrganaizationId()
    {
         return  organaizationId;
    }
    
    public String getOrg_name()
    {
         return  org_name;
    }
    
    public String getOrg_street()
    {
         return  org_street;
    }
    
    public String getOrg_city()
    {
         return  org_city;
    }
    
    public int getOrg_maxCapacity()
    {
         return  org_maxCapacity;
    }
    
    public String getOrg_email()
    {
         return  org_email;
    }
    
    public int getOrg_contactNumber()
    {
         return  org_contactNumber;
    }

    public int getServiceId()
    {
        return serviceId;
    }
    
    public String getSer_type()
    {
        return ser_type;
    }
    
    public String getSer_fees()
    {
        return ser_fees;
    }
    
    public int getStaffId()
    {
        return staffId;
    }
    public String getst_firstName()
    {
        return st_firstName;
    }
    public  String getst_lastName()
    {
        return st_lastName;
    }         
     
    public  String getst_role()
    {
        return st_role;
    }
            
    public String getst_gender()
    {
        return st_gender;
    }        
            
    public  String getst_nationalId()
    {
        return st_nationalId;
    }
    
    public  String getst_street()
    {
        return st_street;
    }        
            
    public String getst_city()
    {
        return st_city;
    }        
            
    public int  getst_contactNumber()
    {
        return  st_contactNumber;
    }
   
    public int getcustomerId()
    {
        return customerId;
    }
    
    public String getcs_firstName()
    {
        return cs_firstName;
    }        
            
    public String   getcs_lastName()
    {
        return cs_lastName;
    }        
            
    public String   getcs_nationalId()
    {
        return cs_nationalId;
    }        
    public  String  getcs_street()
    {
        return cs_street;
    }        
    
    public  String  getcs_city()
    {
        return cs_city;
    }
    
    public int getcs_contactNumber()
    {
        return cs_contactNumber;
    }
    
    public  int getreservationId()
    {
        return reservationId;
    }
    
    public String getdres_dateOfReservation()
    {
        return res_dateOfReservation;
    }
    
    public String getres_dateOfEvent()
    {
        return res_dateOfEvent;
    }
    
    public  int getorderId()
    {
        return orderId;
    }
    
    public  int getor_quantity()
    {
        return or_quantity;
    }
    
    
    public  int getfoodMenuId()
    {
        return foodMenuId;
    }
    
    public String getfm_foodName()
    {
        return fm_foodName;
    }
    
    public  int getfm_price()
    {
        return fm_price;
    }
    
}