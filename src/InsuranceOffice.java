//A class responsible for storing policies and preparing a report for the manager.

import java.util.ArrayList;

public class InsuranceOffice {

    //Example fields:
    private String name;
    private ArrayList<Policy> policies;

    public InsuranceOffice(String name) {
        this.name = name;
        this.policies = new ArrayList<>();
    }


    public void addPolicy(Policy policy) {
        policies.add(policy);

    }

    public void printReport() {
        System.out.println("Insurance Office Report: " + name);

        for (Policy p : policies) {
            System.out.println(p);
        }
    }

    public double calculateTotalPremium() {
        double sum = 0;
        for (Policy p : policies) {
            sum += p.getFinalPremium();
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    public double calculateTotalRenewalForecast() {
        double sum = 0;
        for (Policy p : policies) {
            sum += p.getRenewalPremium();
        }
        return Math.round(sum * 100.0) / 100.0;
    }


    public double countHighRiskPolicies() {
        int count = 0;
        for (Policy p : policies) {
            if (p.getRiskLevel() >= 4) {
                count++;
            }
        }
        return count;

    }

    public Policy findByNumber(String policyNumber) {
        for (Policy p : policies) {
            if (p.getPolicyNumber().equals(policyNumber)) {
                return p;
            }
        }
        return null;

    }

    public void printCheaperThan(double threshold) {
        System.out.println("Policies cheaper than " + threshold + ":");
        for (Policy p : policies) {
            if (p.getFinalPremium() < threshold) {
                System.out.println(p);
            }

        }
    }
}


        //Example business logic
    //You do not have to use exactly these formulas, but the result should depend on several business conditions, not just one simple addition.
    //
    //Each policy starts from basePremium and a shared administrative fee stored in a static field.
    //You may add a surcharge based on risk level, for example riskLevel * 120.
    //If the vehicle value is above a chosen threshold, you may add an extra fee.
    //If the client has an alarm, you may apply a discount.
    //If the client is claim-free, you may apply an additional percentage discount.
    //The final premium should not fall below a reasonable minimum, for example the base premium or a defined minimum amount.
    //It is also worth adding a method such as calculateRenewalPremium(), which prepares a renewal offer for the next year. Such a method may start from the final premium, but also include an extra charge for high risk, a surcharge for a more expensive vehicle, a discount for claim-free history, a discount for an alarm system, and a rule that limits the minimum or maximum change compared to the current premium.
    //


