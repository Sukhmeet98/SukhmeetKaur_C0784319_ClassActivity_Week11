package SukhmeetKaur_C0784319_ClassActivity_week11.employee;

import SukhmeetKaur_C0784319_ClassActivity_week11.Gender;
import SukhmeetKaur_C0784319_ClassActivity_week11.Person;
import SukhmeetKaur_C0784319_ClassActivity_week11.vehicle.Vehicle;

public class Employee extends Person {
        double totalSalary;

        public Employee(int id, String first_name, String last_name, Gender gender, Vehicle vehicle, double totalSalary) {
            super(id, first_name, last_name, gender, vehicle);
            this.totalSalary = totalSalary;
        }

        public double getTotalSalary() {
            return totalSalary;
        }

        public void setTotalSalary(double totalSalary) {
            this.totalSalary = totalSalary;
        }
    }


