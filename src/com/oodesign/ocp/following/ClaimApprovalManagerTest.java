
package com.oodesign.ocp.following;

/**
 * @author suresh.gupta
 *
 */
public class ClaimApprovalManagerTest {

    public static void main(String[] args) throws Exception {
        ClaimApprovalManager claim1 = new ClaimApprovalManager();

        InsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        claim1.processClaim(healthInsuranceSurveyor);

        InsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        claim1.processClaim(vehicleInsuranceSurveyor);
    }
}
