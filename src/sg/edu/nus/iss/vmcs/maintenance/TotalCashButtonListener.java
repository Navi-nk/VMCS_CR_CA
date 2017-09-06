package sg.edu.nus.iss.vmcs.maintenance;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 *
 * @version 5.0 5/09/2017
 * @author Olivo Miotto, Pang Ping Li, Qin Zhi Guo
 */

public class TotalCashButtonListener implements ActionListener {
    MaintenanceController mctrl;

    public TotalCashButtonListener(MaintenanceController mc) {
        mctrl = mc;
    }
    public void actionPerformed(ActionEvent e) {
        mctrl.getTotalCash();
        mctrl.getTotalCoin();
        mctrl.displayCoin();
    }
}
