package org.example.Level1;

import org.example.Level1.Bussiness.OnlineWorker;
import org.example.Level1.Bussiness.OnsiteWorker;

public class DepracatedMethods {
    @SuppressWarnings("deprecated")
    public static void depractedMethods(){
        OnsiteWorker.deprecatedOnsiteMethod();
        OnlineWorker.deprecatedOnlineMethod();
    }
}
