
    create table crm.accounts (
       account_id  serial not null,
        created_date date,
        updated_date date,
        email varchar(255),
        enabled boolean,
        pwd varchar(255),
        primary key (account_id)
    );

    create table crm.cities (
       city_id  serial not null,
        created_date date,
        updated_date date,
        city varchar(255),
        state_id int4,
        primary key (city_id)
    );

    create table crm.langs (
       lang_id varchar(255) not null,
        lang varchar(255),
        primary key (lang_id)
    );

    create table crm.roles (
       role_id varchar(255) not null,
        role varchar(255),
        primary key (role_id)
    );

    create table crm.specs (
       spec_id varchar(255) not null,
        created_date date,
        updated_date date,
        primary key (spec_id)
    );

    create table crm.specs_translations (
       spec_id varchar(255) not null,
        translation_id int4 not null,
        primary key (spec_id, translation_id)
    );

    create table crm.states (
       state_id int4 not null,
        state varchar(255),
        primary key (state_id)
    );

    create table crm.translations (
       translation_id  serial not null,
        created_date date,
        updated_date date,
        translation varchar(255),
        lang_id varchar(255),
        primary key (translation_id)
    );

    create table crm.users (
       user_id  serial not null,
        created_date date,
        updated_date date,
        enabled boolean,
        fiscal_code varchar(255),
        name varchar(255),
        surname varchar(255),
        account_id int4,
        role_id varchar(255),
        primary key (user_id)
    );

    create table crm.users_specs (
       user_id varchar(255) not null,
        spec_id varchar(255) not null
    );

    alter table crm.accounts 
       drop constraint UK_n7ihswpy07ci568w34q0oi8he;

    alter table crm.accounts 
       add constraint UK_n7ihswpy07ci568w34q0oi8he unique (email);

    alter table crm.specs_translations 
       drop constraint UK_rprrremgfbtxyyi92hptxldtb;

    alter table crm.specs_translations 
       add constraint UK_rprrremgfbtxyyi92hptxldtb unique (translation_id);

    alter table crm.users 
       drop constraint UK_p8rpwek75uww1cmxdsofs8f78;

    alter table crm.users 
       add constraint UK_p8rpwek75uww1cmxdsofs8f78 unique (fiscal_code);

    alter table crm.users_specs 
       drop constraint UK_bwpl0irc5k4yvd17gr9lgp0sv;

    alter table crm.users_specs 
       add constraint UK_bwpl0irc5k4yvd17gr9lgp0sv unique (spec_id);

    create table ecommerce.categories (
       category_id  serial not null,
        created_date date,
        updated_date date,
        primary key (category_id)
    );

    create table ecommerce.categories_translations (
       category_id int4 not null,
        translation_id int4 not null,
        primary key (category_id, translation_id)
    );

    create table ecommerce.products (
       product_id  serial not null,
        created_date date,
        updated_date date,
        price numeric(19, 2) not null,
        quantity int4 not null,
        primary key (product_id)
    );

    create table ecommerce.products_categories (
       product_id int4 not null,
        category_id int4 not null
    );

    create table ecommerce.products_translations (
       product_id int4 not null,
        translation_id int4 not null
    );

    create table ecommerce.stores (
       store_id  serial not null,
        created_date date,
        updated_date date,
        store varchar(255),
        postal_code int4,
        street varchar(255),
        city_id int4,
        primary key (store_id)
    );

    create table ecommerce.stores_products (
       store_id int4,
        product_id int4 not null,
        primary key (product_id)
    );

    create table ecommerce.users_cart (
       user_cart_id  serial not null,
        created_date date,
        updated_date date,
        quantity int4 not null,
        total_price numeric(19, 2) not null,
        product_id int4 not null,
        user_id varchar(255) not null,
        primary key (user_cart_id)
    );

    create table ecommerce.users_orders (
       user_id varchar(255) not null,
        product_id int4 not null
    );

    create table ecommerce.users_stores (
       user_id varchar(255) not null,
        store_id int4 not null,
        primary key (store_id)
    );

    alter table ecommerce.categories_translations 
       drop constraint UK_py3e8qvx7d4xnj6fxff4mvpba;

    alter table ecommerce.categories_translations 
       add constraint UK_py3e8qvx7d4xnj6fxff4mvpba unique (translation_id);

    alter table ecommerce.products_categories 
       drop constraint UK_h68v82rb4q1qff468ds4vwqyj;

    alter table ecommerce.products_categories 
       add constraint UK_h68v82rb4q1qff468ds4vwqyj unique (category_id);

    alter table ecommerce.products_translations 
       drop constraint UK_jy3wdun3ew6u4vrlfd223q2td;

    alter table ecommerce.products_translations 
       add constraint UK_jy3wdun3ew6u4vrlfd223q2td unique (translation_id);

    alter table ecommerce.users_orders 
       drop constraint UK_j97n30reigwj9vevjyyp2jcyo;

    alter table ecommerce.users_orders 
       add constraint UK_j97n30reigwj9vevjyyp2jcyo unique (product_id);
create sequence hibernate_sequence start 1 increment 1;

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

    alter table crm.users_specs 
       add constraint FKdvlpowdsnvivbe5bjoxgi4c9e 
       foreign key (spec_id) 
       references crm.specs;

    alter table crm.users_specs 
       add constraint FK7qvsc4p1qi6hx5a8eb4fuql9u 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.categories_translations 
       add constraint FKtiocd34bxare1dffuyfrfje0e 
       foreign key (translation_id) 
       references crm.translations;

    alter table ecommerce.categories_translations 
       add constraint FK811cpj5ahrgngxsevcgbvqeax 
       foreign key (category_id) 
       references ecommerce.categories;

    alter table ecommerce.products_categories 
       add constraint FKqt6m2o5dly3luqcm00f5t4h2p 
       foreign key (category_id) 
       references ecommerce.categories;

    alter table ecommerce.products_categories 
       add constraint FKtj1vdea8qwerbjqie4xldl1el 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.products_translations 
       add constraint FKckn1e460u8nmap2b5rerycfwm 
       foreign key (translation_id) 
       references crm.translations;

    alter table ecommerce.products_translations 
       add constraint FKrb4l1n108cy7ifj53kuvfw0hr 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.stores 
       add constraint FKoi3i5uaki2wfnk0mjvf4513gb 
       foreign key (city_id) 
       references crm.cities;

    alter table ecommerce.stores_products 
       add constraint FKkr69gr3x80v60hd9d2bmjpbti 
       foreign key (store_id) 
       references ecommerce.stores;

    alter table ecommerce.stores_products 
       add constraint FKnql58gp9lehxhda6tytrv7cc4 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_cart 
       add constraint FK97rl4on9o8349tff3yc7yt8n5 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_cart 
       add constraint FKdn91r1vbqdmcgxrcnwxokfjys 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.users_orders 
       add constraint FK787nkee14cbw4v063f31e69ro 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_orders 
       add constraint FKms88pdhtsiuuusjpeij73f6df 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.users_stores 
       add constraint FK41enlc1xt5092gudcwk0sryv3 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.users_stores 
       add constraint FKffw2be032gwcrfodb6hswr8dh 
       foreign key (store_id) 
       references ecommerce.stores;

    alter table crm.users_specs 
       add constraint FK7qvsc4p1qi6hx5a8eb4fuql9u 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.categories_translations 
       add constraint FKtiocd34bxare1dffuyfrfje0e 
       foreign key (translation_id) 
       references crm.translations;

    alter table ecommerce.categories_translations 
       add constraint FK811cpj5ahrgngxsevcgbvqeax 
       foreign key (category_id) 
       references ecommerce.categories;

    alter table ecommerce.products_categories 
       add constraint FKqt6m2o5dly3luqcm00f5t4h2p 
       foreign key (category_id) 
       references ecommerce.categories;

    alter table ecommerce.products_categories 
       add constraint FKtj1vdea8qwerbjqie4xldl1el 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.products_translations 
       add constraint FKckn1e460u8nmap2b5rerycfwm 
       foreign key (translation_id) 
       references crm.translations;

    alter table ecommerce.products_translations 
       add constraint FKrb4l1n108cy7ifj53kuvfw0hr 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.stores 
       add constraint FKoi3i5uaki2wfnk0mjvf4513gb 
       foreign key (city_id) 
       references crm.cities;

    alter table ecommerce.stores_products 
       add constraint FKkr69gr3x80v60hd9d2bmjpbti 
       foreign key (store_id) 
       references ecommerce.stores;

    alter table ecommerce.stores_products 
       add constraint FKnql58gp9lehxhda6tytrv7cc4 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_cart 
       add constraint FK97rl4on9o8349tff3yc7yt8n5 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_cart 
       add constraint FKdn91r1vbqdmcgxrcnwxokfjys 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.users_orders 
       add constraint FK787nkee14cbw4v063f31e69ro 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_orders 
       add constraint FKms88pdhtsiuuusjpeij73f6df 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.users_stores 
       add constraint FK41enlc1xt5092gudcwk0sryv3 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.users_stores 
       add constraint FKffw2be032gwcrfodb6hswr8dh 
       foreign key (store_id) 
       references ecommerce.stores;

    alter table crm.users_specs 
       add constraint FK7qvsc4p1qi6hx5a8eb4fuql9u 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.categories_translations 
       add constraint FKtiocd34bxare1dffuyfrfje0e 
       foreign key (translation_id) 
       references crm.translations;

    alter table ecommerce.categories_translations 
       add constraint FK811cpj5ahrgngxsevcgbvqeax 
       foreign key (category_id) 
       references ecommerce.categories;

    alter table ecommerce.products_categories 
       add constraint FKqt6m2o5dly3luqcm00f5t4h2p 
       foreign key (category_id) 
       references ecommerce.categories;

    alter table ecommerce.products_categories 
       add constraint FKtj1vdea8qwerbjqie4xldl1el 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.products_translations 
       add constraint FKckn1e460u8nmap2b5rerycfwm 
       foreign key (translation_id) 
       references crm.translations;

    alter table ecommerce.products_translations 
       add constraint FKrb4l1n108cy7ifj53kuvfw0hr 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.stores 
       add constraint FKoi3i5uaki2wfnk0mjvf4513gb 
       foreign key (city_id) 
       references crm.cities;

    alter table ecommerce.stores_products 
       add constraint FKkr69gr3x80v60hd9d2bmjpbti 
       foreign key (store_id) 
       references ecommerce.stores;

    alter table ecommerce.stores_products 
       add constraint FKnql58gp9lehxhda6tytrv7cc4 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_cart 
       add constraint FK97rl4on9o8349tff3yc7yt8n5 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_cart 
       add constraint FKdn91r1vbqdmcgxrcnwxokfjys 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.users_orders 
       add constraint FK787nkee14cbw4v063f31e69ro 
       foreign key (product_id) 
       references ecommerce.products;

    alter table ecommerce.users_orders 
       add constraint FKms88pdhtsiuuusjpeij73f6df 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.users_stores 
       add constraint FK41enlc1xt5092gudcwk0sryv3 
       foreign key (user_id) 
       references crm.users;

    alter table ecommerce.users_stores 
       add constraint FKffw2be032gwcrfodb6hswr8dh 
       foreign key (store_id) 
       references ecommerce.stores;
