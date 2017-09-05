package sg.edu.nus.iss.vmcs.machinery;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

import java.awt.*;
import java.awt.event.*;

/**
 *
 *
 * @version 5.0 5/09/2017
 * @author Olivo Miotto, Pang Ping Li
 */

public class DoorListener implements ItemListener {
    private MachineryController mctrl;

    public DoorListener(MachineryController mc) {
        mctrl = mc;
    }
    public void itemStateChanged(ItemEvent e) {
        Checkbox cb;

        cb = (Checkbox) e.getSource();

        System.out.println("DoorListener:" + cb.getState());
        mctrl.setDoorState(cb.getState());
    }
}
