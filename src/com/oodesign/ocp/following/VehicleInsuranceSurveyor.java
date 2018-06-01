
package com.oodesign.ocp.following;

/**
 * @author suresh.gupta
 *
 */
public class VehicleInsuranceSurveyor implements InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        /* Logic to validate vehicle insurance claims */
        return true;
    }
}
