public class Tenant {
    private String name;
    private String telephone;
    private int lengthOfTenure;

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getLengthOfTenure() {
        return lengthOfTenure;
    }

    public Tenant(String initName, String initTelephone, int initLengthOfTenure) {
        name = initName;
        telephone = initTelephone;
        lengthOfTenure = initLengthOfTenure;
    }

    public static void main(String[] args) {
        String name = "Mike";
        String telephone = "88888888";
        int length = 100;
        Tenant tenantOne = new Tenant(name, telephone, length);
        System.out.println("The name of tenant is " + tenantOne.getName() + ", telephone is " + tenantOne.getTelephone() + ", the length of tenant is " + tenantOne.getLengthOfTenure());
    }

}