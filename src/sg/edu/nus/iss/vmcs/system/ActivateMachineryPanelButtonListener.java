package sg.edu.nus.iss.vmcs.system;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.awt.event.*;

/**
 *
 *
 * @version 5.0 5/09/2017
 * @author Olivo Miotto, Pang Ping Li
 */

public class ActivateMachineryPanelButtonListener implements ActionListener {

    private SimulationController ctrl;

    public ActivateMachineryPanelButtonListener(SimulationController ct) {
        ctrl = ct;
    }
    public void actionPerformed(ActionEvent e) {
        /**@todo: Implement this java.awt.event.ActionListener method*/
        ctrl.setupSimulator();
    }
}
