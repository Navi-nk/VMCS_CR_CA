package sg.edu.nus.iss.vmcs.store;

/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */

/**
 *
 *
 * @version 5.0 5/09/2017
 * @author Olivo Miotto, Pang Ping Li
 */

public class DrinksStoreItem extends StoreItem {

    public DrinksStoreItem(DrinksBrand ob, int qty) {
        super((StoreObject) ob, qty);
    }

}
