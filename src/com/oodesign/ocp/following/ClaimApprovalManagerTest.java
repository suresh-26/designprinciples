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
