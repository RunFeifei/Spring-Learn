package com.fei.run;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Consumer;

public class Fei {

    final String repos = "trade_group,init_system,trade_group_table,commercial,brand,trade,trade_extra,trade_customer,trade_privilege,trade_deposit,trade_item,trade_tax_detail,trade_table,payment,payment,payment_item,trade_derived_fee,trade_promotion,trade,payment,trade_mark,trade_reconciliation_detail,tables,init_system,trade,dish_shop,trade_extra,trade,trade_privilege,trade_promotion,payment_item,trade,trade,payment,payment_item,trade_promotion,payment_item_groupon,trade_group,trade,payment_item,payment,trade_extra,trade_group,Commercial,trade_group_table,trade,trade,trade_table,payment,payment_item,init_system,trade_main_sub_relation,trade,trade_table,tables,commercial_area,trade_customer,trade_table,trade_deposit,trade_reason_rel,trade_privilege,trade_promotion,payment_item,trade,trade,payment,payment_item,trade_promotion,payment_item_groupon,trade,trade_init_config,trade_privilege,payment,payment_item,trade,trade_promotion,payment_item_extra,payment_item_exception_reason,payment_item_init_config,order_log,snapshot_report,trade_item,dish_shop,dish_unit_dictionary,trade_item_property,dish_property,trade_privilege,extra_charge,payment,trade,payment,payment_item,earnest_money_relation,earnest_money_relation,trade,payment,trade,payment,payment_item,trade_reconciliation_detail,trade_extra,trade_promotion,trade_group_relation,trade_group_relation,trade";

    @Test
    public void testFei() {
        final String[] repoArray = repos.split(",");
        HashSet<String> set = new HashSet<>();
        Arrays.stream(repoArray).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                set.add(s);
            }
        });
        System.out.println(set.toString());
    }
}
