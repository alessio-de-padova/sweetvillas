alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_categories add constraint FKqt6m2o5dly3luqcm00f5t4h2p foreign key (category_id) references ecommerce.categories;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_categories add constraint FKqt6m2o5dly3luqcm00f5t4h2p foreign key (category_id) references ecommerce.categories;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_categories add constraint FKqt6m2o5dly3luqcm00f5t4h2p foreign key (category_id) references ecommerce.categories;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_categories add constraint FKqt6m2o5dly3luqcm00f5t4h2p foreign key (category_id) references ecommerce.categories;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;
alter table ecommerce.products_categories drop constraint UK_h68v82rb4q1qff468ds4vwqyj;
alter table ecommerce.products_categories add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);
alter table ecommerce.users_orders drop constraint UK_j97n30reigwj9vevjyyp2jcyo;
alter table ecommerce.users_orders add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
alter table crm.cities add constraint FKsu54e1tlhaof4oklvv7uphsli foreign key (state_id) references crm.states;
alter table crm.specs_translations add constraint FKjs150rtqp7n1pqfemyf76998 foreign key (translation_id) references crm.translations;
alter table crm.specs_translations add constraint FKfysw7e34flxi8yfg6muga8r1x foreign key (spec_id) references crm.specs;
alter table crm.translations add constraint FKmvnsfvvmnjg6r19p5e2j2a04b foreign key (lang_id) references crm.langs;
alter table crm.users add constraint FKfm8rm8ks0kgj4fhlmmljkj17x foreign key (account_id) references crm.accounts;
alter table crm.users add constraint FKp56c1712k691lhsyewcssf40f foreign key (role_id) references crm.roles;
alter table ecommerce.products_categories add constraint FKqt6m2o5dly3luqcm00f5t4h2p foreign key (category_id) references ecommerce.categories;
alter table ecommerce.products_translations add constraint FKrb4l1n108cy7ifj53kuvfw0hr foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_cart add constraint FK97rl4on9o8349tff3yc7yt8n5 foreign key (product_id) references ecommerce.products;
alter table ecommerce.users_orders add constraint FK787nkee14cbw4v063f31e69ro foreign key (product_id) references ecommerce.products;

    alter table ecommerce.products_categories 
       drop constraint UK_h68v82rb4q1qff468ds4vwqyj;

    alter table ecommerce.products_categories 
       add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);

    alter table ecommerce.users_orders 
       drop constraint UK_j97n30reigwj9vevjyyp2jcyo;

    alter table ecommerce.users_orders 
       add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);

    alter table crm.cities 
       add constraint FKsu54e1tlhaof4oklvv7uphsli 
       foreign key (state_id) 
       references crm.states;

    alter table crm.specs_translations 
       add constraint FKjs150rtqp7n1pqfemyf76998 
       foreign key (translation_id) 
       references crm.translations;

    alter table crm.specs_translations 
       add constraint FKfysw7e34flxi8yfg6muga8r1x 
       foreign key (spec_id) 
       references crm.specs;

    alter table crm.translations 
       add constraint FKmvnsfvvmnjg6r19p5e2j2a04b 
       foreign key (lang_id) 
       references crm.langs;

    alter table crm.users 
       add constraint FKfm8rm8ks0kgj4fhlmmljkj17x 
       foreign key (account_id) 
       references crm.accounts;

    alter table crm.users 
       add constraint FKp56c1712k691lhsyewcssf40f 
       foreign key (role_id) 
       references crm.roles;

    alter table ecommerce.products_categories 
       add constraint FKqt6m2o5dly3luqcm00f5t4h2p 
       foreign key (category_id) 
       references ecommerce.categories;

    alter table ecommerce.products_translations 
       add constraint FKrb4l1n108cy7ifj53kuvfw0hr 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_cart 
       add constraint FK97rl4on9o8349tff3yc7yt8n5 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_orders 
       add constraint FK787nkee14cbw4v063f31e69ro 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.products_categories 
       drop constraint UK_h68v82rb4q1qff468ds4vwqyj;

    alter table ecommerce.products_categories 
       add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);

    alter table ecommerce.users_orders 
       drop constraint UK_j97n30reigwj9vevjyyp2jcyo;

    alter table ecommerce.users_orders 
       add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);

    alter table crm.cities 
       add constraint FKsu54e1tlhaof4oklvv7uphsli 
       foreign key (state_id) 
       references crm.states;

    alter table crm.specs_translations 
       add constraint FKjs150rtqp7n1pqfemyf76998 
       foreign key (translation_id) 
       references crm.translations;

    alter table crm.specs_translations 
       add constraint FKfysw7e34flxi8yfg6muga8r1x 
       foreign key (spec_id) 
       references crm.specs;

    alter table crm.translations 
       add constraint FKmvnsfvvmnjg6r19p5e2j2a04b 
       foreign key (lang_id) 
       references crm.langs;

    alter table crm.users 
       add constraint FKfm8rm8ks0kgj4fhlmmljkj17x 
       foreign key (account_id) 
       references crm.accounts;

    alter table crm.users 
       add constraint FKp56c1712k691lhsyewcssf40f 
       foreign key (role_id) 
       references crm.roles;

    alter table ecommerce.products_categories 
       add constraint FKqt6m2o5dly3luqcm00f5t4h2p 
       foreign key (category_id) 
       references ecommerce.categories;

    alter table ecommerce.products_translations 
       add constraint FKrb4l1n108cy7ifj53kuvfw0hr 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_cart 
       add constraint FK97rl4on9o8349tff3yc7yt8n5 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_orders 
       add constraint FK787nkee14cbw4v063f31e69ro 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.products_categories 
       drop constraint UK_h68v82rb4q1qff468ds4vwqyj;

    alter table ecommerce.products_categories 
       add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);

    alter table ecommerce.users_orders 
       drop constraint UK_j97n30reigwj9vevjyyp2jcyo;

    alter table ecommerce.users_orders 
       add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);

    alter table crm.cities 
       add constraint FKsu54e1tlhaof4oklvv7uphsli 
       foreign key (state_id) 
       references crm.states;

    alter table crm.specs_translations 
       add constraint FKjs150rtqp7n1pqfemyf76998 
       foreign key (translation_id) 
       references crm.translations;

    alter table crm.specs_translations 
       add constraint FKfysw7e34flxi8yfg6muga8r1x 
       foreign key (spec_id) 
       references crm.specs;

    alter table crm.translations 
       add constraint FKmvnsfvvmnjg6r19p5e2j2a04b 
       foreign key (lang_id) 
       references crm.langs;

    alter table crm.users 
       add constraint FKfm8rm8ks0kgj4fhlmmljkj17x 
       foreign key (account_id) 
       references crm.accounts;

    alter table crm.users 
       add constraint FKp56c1712k691lhsyewcssf40f 
       foreign key (role_id) 
       references crm.roles;

    alter table ecommerce.products_categories 
       add constraint FKqt6m2o5dly3luqcm00f5t4h2p 
       foreign key (category_id) 
       references ecommerce.categories;

    alter table ecommerce.products_translations 
       add constraint FKrb4l1n108cy7ifj53kuvfw0hr 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_cart 
       add constraint FK97rl4on9o8349tff3yc7yt8n5 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_orders 
       add constraint FK787nkee14cbw4v063f31e69ro 
       foreign key (product_id) 
       references ecommerce.products;
