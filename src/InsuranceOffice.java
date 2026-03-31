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



    public addPolicy(Policy policy){

    }
    public printReport(){

    }
    public calculateTotalPremium(){

    }
    public calculateTotalRenewalForecast(){

    }
    public countHighRiskPolicies(){

    }
    public Policy findByNumber(String policyNumber){

    }
    public printCheaperThan(double threshold){

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
    //Algorithm for calculateRenewalPremium()
    //It is worth describing this method step by step so that the logic is clear and easy to verify. One possible algorithm is:
    //
    //First calculate the current final premium by calling calculateFinalPremium().
    //Use that value as the starting point for the renewal premium.
    //If riskLevel is high, increase the renewal premium: by 10% for level 4, by 20% for level 5 or higher.
    //If vehicleValue is above a chosen threshold, for example 60000, add a fixed surcharge, for example 150.
    //If the client is claim-free, reduce the result by 8%.
    //If the vehicle has an alarm, reduce the result by another 5%.
    //If after all adjustments the new premium would fall below 90% of the current final premium, set a minimum threshold equal to 90% of that premium.
    //If after all adjustments the new premium would exceed 125% of the current final premium, set a maximum threshold equal to 125% of that premium.
    //Finally return the result rounded to two decimal places.

