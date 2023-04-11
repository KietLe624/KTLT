
package Lab4;

import java.util.Scanner;

public class Company {
    public String id;
    public String name;
    public String country;
    public double capital;
    public double revenue;

    public Company () {
    }

    public Company (String y1, String y2, String y3, double y4, double y5) {
        this.id = y1;
        this.name = y2;
        this.country = y3;
        this.capital = y4;
        this.revenue = y5;
    }

    public void show() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Country: " + getCountry());
        System.out.println("Capital: " + getCapital());
        System.out.println("Revenue: " + getRevenue());
    }

    public double IncomeTax() {
        if (this.country.equalsIgnoreCase("Viet Nam"))
            return this.revenue * 0.12;
        else
            return this.revenue * 0.08;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    public void In(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap country: ");
        country =sc.nextLine();
        System.out.print("Nhap capital: ");
        capital =sc.nextDouble();
        System.out.print("Nhap revenue: ");
        revenue = sc.nextDouble();
    }
}

