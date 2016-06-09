/*
 * Copyright (c) Rakuten, Inc. All Rights Reserved.
 * 
 * This program is the information assets which are handled
 * as "Strictly Confidential".
 * Permission of Use is only admitted in Rakuten Inc.
 * Development Department.
 * If you don't have permission , MUST not be published,
 * broadcast, rewritten for broadcast or publication
 * or redistributed directly or indirectly in any medium.
 * 
 * $Id$
 * Created on Apr 18, 2016
 * Updated on $Date$
 */
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
