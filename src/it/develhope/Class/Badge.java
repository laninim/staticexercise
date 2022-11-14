package it.develhope.Class;

public class Badge {

    private static int totalNumberOfEmployee = 0;
    private String badgeIdCode;
    public Employee employee;

    public Badge(Employee employeeThatNeedBudge){
        Badge.keepTrackOfEmployee();
        this.employee = employeeThatNeedBudge;
        this.badgeIdCode = generateBadgeIdCode();
    }

    private static void keepTrackOfEmployee(){
        Badge.totalNumberOfEmployee ++;
    }

    private String generateBadgeIdCode(){
        return "XIZ"+employee.getName()+employee.getSurname()+"XIZ";
    }

    public void showBadgeDetails(){
        System.out.println("Total Employee: " + Badge.totalNumberOfEmployee);
        System.out.println(employee.getEmployeeDetails());
        System.out.println("BadgeIDCode: " + this.badgeIdCode);
    }
}
