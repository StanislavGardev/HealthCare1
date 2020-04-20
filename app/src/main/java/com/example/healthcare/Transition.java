package com.example.healthcare;

import android.content.Context;
import android.content.Intent;

public class Transition {
    private static final int TOTAL_ACTIVITIES = 100;
    private String[] activitesOrder = new String[TOTAL_ACTIVITIES];
     public Transition() {
         initializeActivitesOrder();
     }

    private void initializeActivitesOrder() {
         int i = 0;
        activitesOrder[i++] = MainActivity.class.getName();
        activitesOrder[i++] = Activity_2.class.getName();
        activitesOrder[i++] = ScrollingActivity0.class.getName();
        activitesOrder[i++] = ScrollingActivity1.class.getName();
        activitesOrder[i++] = ScrollingActivity2.class.getName();
        activitesOrder[i++] = ScrollingActivity3_1.class.getName();
        activitesOrder[i++] = table_3_2_1.class.getName();
        activitesOrder[i++] = table_3_2_2.class.getName();
        activitesOrder[i++] = table_3_3.class.getName();
        activitesOrder[i++] = table_4_1.class.getName();
        activitesOrder[i++] = table_5_1.class.getName();
        activitesOrder[i++] = table_5_2.class.getName();
        activitesOrder[i++] = table_5_2_1.class.getName();
        activitesOrder[i++] = table_5_2_2.class.getName();
        activitesOrder[i++] = table_5_3.class.getName();
        activitesOrder[i++] = table_5_4_1.class.getName();
        activitesOrder[i++] = table_5_4_2_1.class.getName();
        activitesOrder[i++] = table_5_4_2_2.class.getName();
        activitesOrder[i++] = table_5_4_2_3.class.getName();
        activitesOrder[i++] = table_5_4_3_1.class.getName();
        activitesOrder[i++] = table_5_4_3_2.class.getName();
        activitesOrder[i++] = table_5_4_3_3.class.getName();
        activitesOrder[i++] = table_5_4_3_4.class.getName();
        activitesOrder[i++] = table_5_4_4.class.getName();
        activitesOrder[i++] = table_6_1.class.getName();
        activitesOrder[i++] = table_6_2.class.getName();
        activitesOrder[i++] = table_6_3_1.class.getName();
        activitesOrder[i++] = table_6_3_2.class.getName();
        activitesOrder[i++] = table_6_3_3_1.class.getName();
        activitesOrder[i++] = table_6_3_3_2.class.getName();
        activitesOrder[i++] = table_6_3_4.class.getName();
        activitesOrder[i++] = table_6_3_5.class.getName();
        activitesOrder[i++] = table_6_4_1.class.getName();
        activitesOrder[i++] = table6_4_2.class.getName();
        activitesOrder[i++] = table_6_4_3.class.getName();
        activitesOrder[i++] = table_6_4_4.class.getName();
        activitesOrder[i++] = table_6_4_5_1.class.getName();
        activitesOrder[i++] = table_6_4_5_2.class.getName();
        activitesOrder[i++] = table_6_4_5_3.class.getName();
        activitesOrder[i++] = table_6_4_6.class.getName();
        activitesOrder[i++] = table_6_5.class.getName();
        activitesOrder[i++] = table_6_6.class.getName();
        activitesOrder[i++] = table_6_7.class.getName();
        activitesOrder[i++] = table_7_1.class.getName();
        activitesOrder[i++] = table_7_2.class.getName();
        activitesOrder[i++] = table_7_2_1.class.getName();
        activitesOrder[i++] = table_7_2_2.class.getName();
        activitesOrder[i++] = table_7_2_3.class.getName();
        activitesOrder[i++] = table_7_3.class.getName();
        activitesOrder[i++] = table_7_4.class.getName();
        activitesOrder[i++] = table_7_4_1.class.getName();
        activitesOrder[i++] = table_7_4_2.class.getName();
        activitesOrder[i++] = table_7_4_3_1.class.getName();
        activitesOrder[i++] = table_7_4_3_2.class.getName();
        activitesOrder[i++] = table_7_5.class.getName();
        activitesOrder[i++] = table_7_6.class.getName();
        activitesOrder[i++] = table_7_6_1_1.class.getName();
        activitesOrder[i++] = table_7_6_1_2.class.getName();
        activitesOrder[i++] = table_7_6_1_3.class.getName();
        activitesOrder[i++] = table_7_6_1_4.class.getName();
        activitesOrder[i++] = table_7_6_2.class.getName();
        activitesOrder[i++] = table_8_1.class.getName();
        activitesOrder[i++] = table_8_2.class.getName();
        activitesOrder[i++] = table_8_3.class.getName();
        activitesOrder[i++] = table_9_1.class.getName();
        activitesOrder[i++] = table_9_2.class.getName();
        activitesOrder[i++] = table_9_3.class.getName();
        activitesOrder[i++] = table_10_1.class.getName();
        activitesOrder[i++] = table_10_2.class.getName();
        activitesOrder[i++] = Table_11.class.getName();
        activitesOrder[i++] = table_13.class.getName();
    }

    public Intent getNextIntent(Context context) {
         Intent intent = new Intent(context, getNextClass(context.getClass().getName()));
         return intent;
    }

    public Intent getPreviousIntent(Context context) {
        Intent intent = new Intent(context, getPreviousClass(context.getClass().getName()));
        return intent;
    }

    private Class<?> getNextClass(String name) {
        Class<?> previousClass = null;
        for (int i = 0; i < activitesOrder.length ; i++) {
            if(name == activitesOrder[i] && i < TOTAL_ACTIVITIES)
            {
                try {
                    previousClass = Class.forName(activitesOrder[i+1]);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

        if(previousClass == null) {
            try {
                previousClass = Class.forName(name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return previousClass;

    }

    private Class<?> getPreviousClass(String name) {
        Class<?> previousClass = null;
        for (int i = 0; i < activitesOrder.length ; i++) {
            if(name == activitesOrder[i] && i > 0)
            {
                try {
                    previousClass =  Class.forName(activitesOrder[i-1]);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

        if(previousClass == null) {
            try {
                previousClass = Class.forName(name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return previousClass;

    }



}
