
package com.oodesign.ocp.violating;

/**
 * @author suresh.gupta
 *
 */
public class ClaimApprovalManager {
    public void processHealthClaim(HealthInsuranceSurveyor surveyor)
    {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }

    // violation of ocp, we need to modify this class as well as HealthinsuranceSurveyor if we need another
    // vehicleInsuranceServeyor
    /*
     * public void processVehicleClaim (VehicleInsuranceSurveyor surveyor)
     * {
     * if(surveyor.isValidClaim()){
     * System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
     * }
     * }
     */
}
