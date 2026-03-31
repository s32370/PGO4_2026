import java.util.Objects;

public class Policy {


    private String policyNumber;
    private String clientName;
    private double basePremium;
    private int riskLevel;
    private double vehicleValue;
    private boolean hasAlarm;
    private boolean claimFreeClient;
    private static int createdPolicyCount=; //////comeback
    private static final double ADMINISTRATIVE_FEE=; ///comeback


//    a constructor initializing all key fields
    public Policy(String policyNumber, String clientName, double basePremium, int riskLevel, double vehicleValue, boolean hasAlarm, boolean claimFreeClient) {

        this.policyNumber = policyNumber;
        this.clientName = clientName;
        this.basePremium = basePremium;
        this.riskLevel = riskLevel;
        this.vehicleValue = vehicleValue;
        this.hasAlarm = hasAlarm;
        this.claimFreeClient = claimFreeClient;

        createdPolicyCount++;
    }

//    getters for report data

    public double getFinalPremium() {
        return calculateFinalPremium();
    }

    public double getRenewalPremium() {
        return calculateRenewalPremium();
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    public static int getCreatedPolicyCount() {
        return createdPolicyCount;
    }


    public double calculateFinalPremium(){

    }
    public double calculateRenewalPremium(){

    }



        // The cleanest option is to place equals() and toString() directly inside the Policy class
        // because it represents one business entity.
        // A static field that counts all created policies also fits naturally there.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public String toString() {
        return "Policy {" + "number='" + policyNumber+'\'' +
                ", client='" + clientName+'\'' +
                ", finalPremium=" + calculateFinalPremium() +
                '}';
    }

}
