package Classes;

public class TeamMember {

    private int teamMemberId;
    private String teamMemberName;
    private double salaryPerHour;

    public TeamMember(int teamMemberId, String teamMemberName, double salaryPerHour) {
        this.teamMemberId = teamMemberId;
        this.teamMemberName = teamMemberName;
        this.salaryPerHour = salaryPerHour;
    }

    public String getTeamMemberName() {
        return teamMemberName;
    }

    public void setTeamMemberName(String teamMemberName) {
        this.teamMemberName = teamMemberName;
    }

    public double getSalaryPerHour() {
        return this.salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getTeamMemberId() {
        return teamMemberId;
    }

    public void setID(int id) {
        this.teamMemberId = id;
    }


    public String toString() {
        return  "Name: "+teamMemberName+"\n"+
                "ID: "+teamMemberId+"\n"+
                "Salary: "+salaryPerHour+"\n";
    }

}