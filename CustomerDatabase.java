package com.company;

//opg 2)

public class CustomerDatabase {


    public Customer[] customerarray;


    public CustomerDatabase() {
        customerarray = new Customer[10];

    }


    public void addtodatabase(Customer customer) {
        for (int i = 0; i < customerarray.length; i++) {
            if (customerarray[i] == null) {
                customerarray[i] = customer;
                return;
            }
        }
    }


    public void deleteCustomer(int idcustomer) {
        int j = 1;
        for (int i = 0; i < customerarray.length; i++) {

            if (customerarray[i] != null && idcustomer == customerarray[i].id) {
                customerarray[i] = null;
            } else if (customerarray[i] == null) {
                j++;
            }

        }
        if (j == customerarray.length) {
            System.out.println("There is no Customers in the database");
        }
    }

    public Customer[] getCustomerses() {
        return customerarray;
    }

    public void printOneCustomer(int iD) {
        int j = 1;
        for (Customer customer : customerarray) {
            if (customer == null) continue;

            if (customer.id == iD) {
                System.out.println("Name: " + customer.name + "    " + "ID: " + customer.id + "    " + "Balance: " + customer.balance);
                return;

            }
        }


    }

    public void printAllCustomers() {
        for (Customer customer : customerarray) {
            if (customer == null) continue;
            System.out.println("Name: " + customer.name + "    " + "ID: " + customer.id + "    " + "Balance: " + customer.balance);
        }
    }
}

