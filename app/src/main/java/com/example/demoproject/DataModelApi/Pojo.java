package com.example.demoproject.DataModelApi;

import java.util.ArrayList;
import java.util.List;

public class Pojo {
    public class AlternativeUnitType{
        public int id;
        public String name;
        public Object description;
        public String created_at;
        public String updated_at;
        public Object deleted_at;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public class Attribute{
        public int id;
        public Object store_id;
        public int attribute_type_id;
        public String name;
        public Object description;
        public String created_at;
        public String updated_at;
        public Object deleted_at;
        public int display;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getStore_id() {
            return store_id;
        }

        public void setStore_id(Object store_id) {
            this.store_id = store_id;
        }

        public int getAttribute_type_id() {
            return attribute_type_id;
        }

        public void setAttribute_type_id(int attribute_type_id) {
            this.attribute_type_id = attribute_type_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public int getDisplay() {
            return display;
        }

        public void setDisplay(int display) {
            this.display = display;
        }
    }

    public class AttributeValue{
        public int id;
        public String value;
        public int store_id;
        public int attribute_id;
        public Object description;
        public Object created_at;
        public String updated_at;
        public Object deleted_at;
        public Pivot pivot;
        public Attribute attribute;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public int getAttribute_id() {
            return attribute_id;
        }

        public void setAttribute_id(int attribute_id) {
            this.attribute_id = attribute_id;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Object getCreated_at() {
            return created_at;
        }

        public void setCreated_at(Object created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public Pivot getPivot() {
            return pivot;
        }

        public void setPivot(Pivot pivot) {
            this.pivot = pivot;
        }

        public Attribute getAttribute() {
            return attribute;
        }

        public void setAttribute(Attribute attribute) {
            this.attribute = attribute;
        }
    }

    public class Brand{
        public int id;
        public String slug;
        public int store_id;
        public int category_id;
        public String name;
        public String icon;
        public String created_at;
        public String updated_at;
        public Object deleted_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public int getCategory_id() {
            return category_id;
        }

        public void setCategory_id(int category_id) {
            this.category_id = category_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public class Category{
        public int id;
        public String slug;
        public int store_id;
        public int type;
        public String name;
        public String icon;
        public Object color;
        public String created_at;
        public String updated_at;
        public Object deleted_at;
        public ArrayList<Object> seos;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public Object getColor() {
            return color;
        }

        public void setColor(Object color) {
            this.color = color;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public ArrayList<Object> getSeos() {
            return seos;
        }

        public void setSeos(ArrayList<Object> seos) {
            this.seos = seos;
        }
    }

    public class ChildCategory{
        public int id;
        public String slug;
        public int store_id;
        public int sub_category_id;
        public String name;
        public Object icon;
        public Object color;
        public String created_at;
        public String updated_at;
        public Object deleted_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public int getSub_category_id() {
            return sub_category_id;
        }

        public void setSub_category_id(int sub_category_id) {
            this.sub_category_id = sub_category_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getIcon() {
            return icon;
        }

        public void setIcon(Object icon) {
            this.icon = icon;
        }

        public Object getColor() {
            return color;
        }

        public void setColor(Object color) {
            this.color = color;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public class City{
        public int id;
        public String name;
        public int state_id;
        public String created_at;
        public String updated_at;
        public Object deleted_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getState_id() {
            return state_id;
        }

        public void setState_id(int state_id) {
            this.state_id = state_id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public class Country{
        public int id;
        public String name;
        public String short_name;
        public int phone_code;
        public int mobile_min_length;
        public int mobile_max_length;
        public String created_at;
        public String updated_at;
        public Object deleted_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShort_name() {
            return short_name;
        }

        public void setShort_name(String short_name) {
            this.short_name = short_name;
        }

        public int getPhone_code() {
            return phone_code;
        }

        public void setPhone_code(int phone_code) {
            this.phone_code = phone_code;
        }

        public int getMobile_min_length() {
            return mobile_min_length;
        }

        public void setMobile_min_length(int mobile_min_length) {
            this.mobile_min_length = mobile_min_length;
        }

        public int getMobile_max_length() {
            return mobile_max_length;
        }

        public void setMobile_max_length(int mobile_max_length) {
            this.mobile_max_length = mobile_max_length;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public class Datum{
        public int id;
        public int store_id;
        public int category_id;
        public int sub_category_id;
        public int child_category_id;
        public String name;
        public String description;
        public String created_at;
        public String updated_at;
        public Object deleted_at;
        public int brand_id;
        public int sku_count;
        public int sku_quantity_count;
        public Store store;
        public Category category;
        public SubCategory sub_category;
        public ChildCategory child_category;
        public Brand brand;
        public ArrayList<Sku> skus;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public int getCategory_id() {
            return category_id;
        }

        public void setCategory_id(int category_id) {
            this.category_id = category_id;
        }

        public int getSub_category_id() {
            return sub_category_id;
        }

        public void setSub_category_id(int sub_category_id) {
            this.sub_category_id = sub_category_id;
        }

        public int getChild_category_id() {
            return child_category_id;
        }

        public void setChild_category_id(int child_category_id) {
            this.child_category_id = child_category_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public int getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(int brand_id) {
            this.brand_id = brand_id;
        }

        public int getSku_count() {
            return sku_count;
        }

        public void setSku_count(int sku_count) {
            this.sku_count = sku_count;
        }

        public int getSku_quantity_count() {
            return sku_quantity_count;
        }

        public void setSku_quantity_count(int sku_quantity_count) {
            this.sku_quantity_count = sku_quantity_count;
        }

        public Store getStore() {
            return store;
        }

        public void setStore(Store store) {
            this.store = store;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        public SubCategory getSub_category() {
            return sub_category;
        }

        public void setSub_category(SubCategory sub_category) {
            this.sub_category = sub_category;
        }

        public ChildCategory getChild_category() {
            return child_category;
        }

        public void setChild_category(ChildCategory child_category) {
            this.child_category = child_category;
        }

        public Brand getBrand() {
            return brand;
        }

        public void setBrand(Brand brand) {
            this.brand = brand;
        }

        public ArrayList<Sku> getSkus() {
            return skus;
        }

        public void setSkus(ArrayList<Sku> skus) {
            this.skus = skus;
        }
    }

    public class Pivot{
        public int sku_id;
        public int tax_type_id;
        public double tax_amount;
        public int specification_id;
        public String value;
        public int attribute_value_id;

        public int getSku_id() {
            return sku_id;
        }

        public void setSku_id(int sku_id) {
            this.sku_id = sku_id;
        }

        public int getTax_type_id() {
            return tax_type_id;
        }

        public void setTax_type_id(int tax_type_id) {
            this.tax_type_id = tax_type_id;
        }

        public double getTax_amount() {
            return tax_amount;
        }

        public void setTax_amount(double tax_amount) {
            this.tax_amount = tax_amount;
        }

        public int getSpecification_id() {
            return specification_id;
        }

        public void setSpecification_id(int specification_id) {
            this.specification_id = specification_id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getAttribute_value_id() {
            return attribute_value_id;
        }

        public void setAttribute_value_id(int attribute_value_id) {
            this.attribute_value_id = attribute_value_id;
        }
    }

    public class PrimaryStoreSkus{
        public int id;
        public Object slug;
        public int store_id;
        public int product_id;
        public Object supplier_id;
        public String name;
        public int type;
        public Object service_duration;
        public int buyer_price;
        public int selling_price;
        public int discounted_selling_price;
        public Object advance_price;
        public int discount_percentage;
        public Object serial_no;
        public String barcode;
        public int unit_type_id;
        public Object alternative_unit_type_id;
        public int quantity;
        public int quantity_conversion;
        public int low_quantity_alert;
        public Object description;
        public Object expiry_date;
        public int tax_type;
        public int is_subscription;
        public Object subscription_type_id;
        public int is_online_sale;
        public Object food_type_id;
        public String stock_location_id;
        public String pos_item_id;
        public String hsn_sac;
        public int mrp_price;
        public Object weight;
        public Object next_delivery_date;
        public int max_order_qty_limit;
        public Object latitude;
        public Object longitude;
        public String created_at;
        public String updated_at;
        public Object deleted_at;
        public Object color_name;
        public Object hexa_code;
        public String is_sku_return_able;
        public String query_search;
        public String product_name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getSlug() {
            return slug;
        }

        public void setSlug(Object slug) {
            this.slug = slug;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public Object getSupplier_id() {
            return supplier_id;
        }

        public void setSupplier_id(Object supplier_id) {
            this.supplier_id = supplier_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getService_duration() {
            return service_duration;
        }

        public void setService_duration(Object service_duration) {
            this.service_duration = service_duration;
        }

        public int getBuyer_price() {
            return buyer_price;
        }

        public void setBuyer_price(int buyer_price) {
            this.buyer_price = buyer_price;
        }

        public int getSelling_price() {
            return selling_price;
        }

        public void setSelling_price(int selling_price) {
            this.selling_price = selling_price;
        }

        public int getDiscounted_selling_price() {
            return discounted_selling_price;
        }

        public void setDiscounted_selling_price(int discounted_selling_price) {
            this.discounted_selling_price = discounted_selling_price;
        }

        public Object getAdvance_price() {
            return advance_price;
        }

        public void setAdvance_price(Object advance_price) {
            this.advance_price = advance_price;
        }

        public int getDiscount_percentage() {
            return discount_percentage;
        }

        public void setDiscount_percentage(int discount_percentage) {
            this.discount_percentage = discount_percentage;
        }

        public Object getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(Object serial_no) {
            this.serial_no = serial_no;
        }

        public String getBarcode() {
            return barcode;
        }

        public void setBarcode(String barcode) {
            this.barcode = barcode;
        }

        public int getUnit_type_id() {
            return unit_type_id;
        }

        public void setUnit_type_id(int unit_type_id) {
            this.unit_type_id = unit_type_id;
        }

        public Object getAlternative_unit_type_id() {
            return alternative_unit_type_id;
        }

        public void setAlternative_unit_type_id(Object alternative_unit_type_id) {
            this.alternative_unit_type_id = alternative_unit_type_id;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity_conversion() {
            return quantity_conversion;
        }

        public void setQuantity_conversion(int quantity_conversion) {
            this.quantity_conversion = quantity_conversion;
        }

        public int getLow_quantity_alert() {
            return low_quantity_alert;
        }

        public void setLow_quantity_alert(int low_quantity_alert) {
            this.low_quantity_alert = low_quantity_alert;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Object getExpiry_date() {
            return expiry_date;
        }

        public void setExpiry_date(Object expiry_date) {
            this.expiry_date = expiry_date;
        }

        public int getTax_type() {
            return tax_type;
        }

        public void setTax_type(int tax_type) {
            this.tax_type = tax_type;
        }

        public int getIs_subscription() {
            return is_subscription;
        }

        public void setIs_subscription(int is_subscription) {
            this.is_subscription = is_subscription;
        }

        public Object getSubscription_type_id() {
            return subscription_type_id;
        }

        public void setSubscription_type_id(Object subscription_type_id) {
            this.subscription_type_id = subscription_type_id;
        }

        public int getIs_online_sale() {
            return is_online_sale;
        }

        public void setIs_online_sale(int is_online_sale) {
            this.is_online_sale = is_online_sale;
        }

        public Object getFood_type_id() {
            return food_type_id;
        }

        public void setFood_type_id(Object food_type_id) {
            this.food_type_id = food_type_id;
        }

        public String getStock_location_id() {
            return stock_location_id;
        }

        public void setStock_location_id(String stock_location_id) {
            this.stock_location_id = stock_location_id;
        }

        public String getPos_item_id() {
            return pos_item_id;
        }

        public void setPos_item_id(String pos_item_id) {
            this.pos_item_id = pos_item_id;
        }

        public String getHsn_sac() {
            return hsn_sac;
        }

        public void setHsn_sac(String hsn_sac) {
            this.hsn_sac = hsn_sac;
        }

        public int getMrp_price() {
            return mrp_price;
        }

        public void setMrp_price(int mrp_price) {
            this.mrp_price = mrp_price;
        }

        public Object getWeight() {
            return weight;
        }

        public void setWeight(Object weight) {
            this.weight = weight;
        }

        public Object getNext_delivery_date() {
            return next_delivery_date;
        }

        public void setNext_delivery_date(Object next_delivery_date) {
            this.next_delivery_date = next_delivery_date;
        }

        public int getMax_order_qty_limit() {
            return max_order_qty_limit;
        }

        public void setMax_order_qty_limit(int max_order_qty_limit) {
            this.max_order_qty_limit = max_order_qty_limit;
        }

        public Object getLatitude() {
            return latitude;
        }

        public void setLatitude(Object latitude) {
            this.latitude = latitude;
        }

        public Object getLongitude() {
            return longitude;
        }

        public void setLongitude(Object longitude) {
            this.longitude = longitude;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public Object getColor_name() {
            return color_name;
        }

        public void setColor_name(Object color_name) {
            this.color_name = color_name;
        }

        public Object getHexa_code() {
            return hexa_code;
        }

        public void setHexa_code(Object hexa_code) {
            this.hexa_code = hexa_code;
        }

        public String getIs_sku_return_able() {
            return is_sku_return_able;
        }

        public void setIs_sku_return_able(String is_sku_return_able) {
            this.is_sku_return_able = is_sku_return_able;
        }

        public String getQuery_search() {
            return query_search;
        }

        public void setQuery_search(String query_search) {
            this.query_search = query_search;
        }

        public String getProduct_name() {
            return product_name;
        }

        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }
    }

    public class Root{
        public int current_page;
        public ArrayList<Datum> data;
        public String first_page_url;
        public int from;
        public int last_page;
        public String last_page_url;
        public String next_page_url;
        public String path;
        public int per_page;
        public Object prev_page_url;
        public int myto;
        public int total;

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public ArrayList<Datum> getData() {
            return data;
        }

        public void setData(ArrayList<Datum> data) {
            this.data = data;
        }

        public String getFirst_page_url() {
            return first_page_url;
        }

        public void setFirst_page_url(String first_page_url) {
            this.first_page_url = first_page_url;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public String getLast_page_url() {
            return last_page_url;
        }

        public void setLast_page_url(String last_page_url) {
            this.last_page_url = last_page_url;
        }

        public String getNext_page_url() {
            return next_page_url;
        }

        public void setNext_page_url(String next_page_url) {
            this.next_page_url = next_page_url;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public Object getPrev_page_url() {
            return prev_page_url;
        }

        public void setPrev_page_url(Object prev_page_url) {
            this.prev_page_url = prev_page_url;
        }

        public int getMyto() {
            return myto;
        }

        public void setMyto(int myto) {
            this.myto = myto;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

    public class Sku{
        public int id;
        public String slug;
        public int store_id;
        public int product_id;
        public Object supplier_id;
        public String name;
        public int type;
        public Object service_duration;
        public int buyer_price;
        public double selling_price;
        public double discounted_selling_price;
        public Object advance_price;
        public int discount_percentage;
        public Object serial_no;
        public String barcode;
        public int unit_type_id;
        public int alternative_unit_type_id;
        public int quantity;
        public int quantity_conversion;
        public int low_quantity_alert;
        public String description;
        public Object expiry_date;
        public int tax_type;
        public int is_subscription;
        public Object subscription_type_id;
        public int is_online_sale;
        public int food_type_id;
        public String stock_location_id;
        public String pos_item_id;
        public String hsn_sac;
        public double mrp_price;
        public Object weight;
        public Object next_delivery_date;
        public int max_order_qty_limit;
        public Object latitude;
        public Object longitude;
        public String created_at;
        public String updated_at;
        public Object deleted_at;
        public String color_name;
        public String hexa_code;
        public String is_sku_return_able;
        public String query_search;
        public String product_name;
        public ArrayList<SkuImage> sku_images;
        public ArrayList<Taxis> taxes;
        public ArrayList<Specification> specifications;
        public UnitType unit_type;
        public AlternativeUnitType alternative_unit_type;
        public Object subscription_type;
        public ArrayList<AttributeValue> attribute_values;
        public ArrayList<Object> employees;
        public PrimaryStoreSkus primary_store_skus;
        public ArrayList<Object> sku_bundle;
        public Object sku_return_policy;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public Object getSupplier_id() {
            return supplier_id;
        }

        public void setSupplier_id(Object supplier_id) {
            this.supplier_id = supplier_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getService_duration() {
            return service_duration;
        }

        public void setService_duration(Object service_duration) {
            this.service_duration = service_duration;
        }

        public int getBuyer_price() {
            return buyer_price;
        }

        public void setBuyer_price(int buyer_price) {
            this.buyer_price = buyer_price;
        }

        public double getSelling_price() {
            return selling_price;
        }

        public void setSelling_price(double selling_price) {
            this.selling_price = selling_price;
        }

        public double getDiscounted_selling_price() {
            return discounted_selling_price;
        }

        public void setDiscounted_selling_price(double discounted_selling_price) {
            this.discounted_selling_price = discounted_selling_price;
        }

        public Object getAdvance_price() {
            return advance_price;
        }

        public void setAdvance_price(Object advance_price) {
            this.advance_price = advance_price;
        }

        public int getDiscount_percentage() {
            return discount_percentage;
        }

        public void setDiscount_percentage(int discount_percentage) {
            this.discount_percentage = discount_percentage;
        }

        public Object getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(Object serial_no) {
            this.serial_no = serial_no;
        }

        public String getBarcode() {
            return barcode;
        }

        public void setBarcode(String barcode) {
            this.barcode = barcode;
        }

        public int getUnit_type_id() {
            return unit_type_id;
        }

        public void setUnit_type_id(int unit_type_id) {
            this.unit_type_id = unit_type_id;
        }

        public int getAlternative_unit_type_id() {
            return alternative_unit_type_id;
        }

        public void setAlternative_unit_type_id(int alternative_unit_type_id) {
            this.alternative_unit_type_id = alternative_unit_type_id;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity_conversion() {
            return quantity_conversion;
        }

        public void setQuantity_conversion(int quantity_conversion) {
            this.quantity_conversion = quantity_conversion;
        }

        public int getLow_quantity_alert() {
            return low_quantity_alert;
        }

        public void setLow_quantity_alert(int low_quantity_alert) {
            this.low_quantity_alert = low_quantity_alert;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Object getExpiry_date() {
            return expiry_date;
        }

        public void setExpiry_date(Object expiry_date) {
            this.expiry_date = expiry_date;
        }

        public int getTax_type() {
            return tax_type;
        }

        public void setTax_type(int tax_type) {
            this.tax_type = tax_type;
        }

        public int getIs_subscription() {
            return is_subscription;
        }

        public void setIs_subscription(int is_subscription) {
            this.is_subscription = is_subscription;
        }

        public Object getSubscription_type_id() {
            return subscription_type_id;
        }

        public void setSubscription_type_id(Object subscription_type_id) {
            this.subscription_type_id = subscription_type_id;
        }

        public int getIs_online_sale() {
            return is_online_sale;
        }

        public void setIs_online_sale(int is_online_sale) {
            this.is_online_sale = is_online_sale;
        }

        public int getFood_type_id() {
            return food_type_id;
        }

        public void setFood_type_id(int food_type_id) {
            this.food_type_id = food_type_id;
        }

        public String getStock_location_id() {
            return stock_location_id;
        }

        public void setStock_location_id(String stock_location_id) {
            this.stock_location_id = stock_location_id;
        }

        public String getPos_item_id() {
            return pos_item_id;
        }

        public void setPos_item_id(String pos_item_id) {
            this.pos_item_id = pos_item_id;
        }

        public String getHsn_sac() {
            return hsn_sac;
        }

        public void setHsn_sac(String hsn_sac) {
            this.hsn_sac = hsn_sac;
        }

        public double getMrp_price() {
            return mrp_price;
        }

        public void setMrp_price(double mrp_price) {
            this.mrp_price = mrp_price;
        }

        public Object getWeight() {
            return weight;
        }

        public void setWeight(Object weight) {
            this.weight = weight;
        }

        public Object getNext_delivery_date() {
            return next_delivery_date;
        }

        public void setNext_delivery_date(Object next_delivery_date) {
            this.next_delivery_date = next_delivery_date;
        }

        public int getMax_order_qty_limit() {
            return max_order_qty_limit;
        }

        public void setMax_order_qty_limit(int max_order_qty_limit) {
            this.max_order_qty_limit = max_order_qty_limit;
        }

        public Object getLatitude() {
            return latitude;
        }

        public void setLatitude(Object latitude) {
            this.latitude = latitude;
        }

        public Object getLongitude() {
            return longitude;
        }

        public void setLongitude(Object longitude) {
            this.longitude = longitude;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public String getColor_name() {
            return color_name;
        }

        public void setColor_name(String color_name) {
            this.color_name = color_name;
        }

        public String getHexa_code() {
            return hexa_code;
        }

        public void setHexa_code(String hexa_code) {
            this.hexa_code = hexa_code;
        }

        public String getIs_sku_return_able() {
            return is_sku_return_able;
        }

        public void setIs_sku_return_able(String is_sku_return_able) {
            this.is_sku_return_able = is_sku_return_able;
        }

        public String getQuery_search() {
            return query_search;
        }

        public void setQuery_search(String query_search) {
            this.query_search = query_search;
        }

        public String getProduct_name() {
            return product_name;
        }

        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }

        public ArrayList<SkuImage> getSku_images() {
            return sku_images;
        }

        public void setSku_images(ArrayList<SkuImage> sku_images) {
            this.sku_images = sku_images;
        }

        public ArrayList<Taxis> getTaxes() {
            return taxes;
        }

        public void setTaxes(ArrayList<Taxis> taxes) {
            this.taxes = taxes;
        }

        public ArrayList<Specification> getSpecifications() {
            return specifications;
        }

        public void setSpecifications(ArrayList<Specification> specifications) {
            this.specifications = specifications;
        }

        public UnitType getUnit_type() {
            return unit_type;
        }

        public void setUnit_type(UnitType unit_type) {
            this.unit_type = unit_type;
        }

        public AlternativeUnitType getAlternative_unit_type() {
            return alternative_unit_type;
        }

        public void setAlternative_unit_type(AlternativeUnitType alternative_unit_type) {
            this.alternative_unit_type = alternative_unit_type;
        }

        public Object getSubscription_type() {
            return subscription_type;
        }

        public void setSubscription_type(Object subscription_type) {
            this.subscription_type = subscription_type;
        }

        public ArrayList<AttributeValue> getAttribute_values() {
            return attribute_values;
        }

        public void setAttribute_values(ArrayList<AttributeValue> attribute_values) {
            this.attribute_values = attribute_values;
        }

        public ArrayList<Object> getEmployees() {
            return employees;
        }

        public void setEmployees(ArrayList<Object> employees) {
            this.employees = employees;
        }

        public PrimaryStoreSkus getPrimary_store_skus() {
            return primary_store_skus;
        }

        public void setPrimary_store_skus(PrimaryStoreSkus primary_store_skus) {
            this.primary_store_skus = primary_store_skus;
        }

        public ArrayList<Object> getSku_bundle() {
            return sku_bundle;
        }

        public void setSku_bundle(ArrayList<Object> sku_bundle) {
            this.sku_bundle = sku_bundle;
        }

        public Object getSku_return_policy() {
            return sku_return_policy;
        }

        public void setSku_return_policy(Object sku_return_policy) {
            this.sku_return_policy = sku_return_policy;
        }
    }

    public class SkuImage{
        public int id;
        public int sku_id;
        public String image_url;
        public Object thumbnail_url;
        public int is_default;
        public String created_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getSku_id() {
            return sku_id;
        }

        public void setSku_id(int sku_id) {
            this.sku_id = sku_id;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public Object getThumbnail_url() {
            return thumbnail_url;
        }

        public void setThumbnail_url(Object thumbnail_url) {
            this.thumbnail_url = thumbnail_url;
        }

        public int getIs_default() {
            return is_default;
        }

        public void setIs_default(int is_default) {
            this.is_default = is_default;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }
    }

    public class Specification{
        public int id;
        public int store_id;
        public String name;
        public String group_name;
        public String created_at;
        public String updated_at;
        public Object deleted_at;
        public Object is_hashed;
        public Pivot pivot;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGroup_name() {
            return group_name;
        }

        public void setGroup_name(String group_name) {
            this.group_name = group_name;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public Object getIs_hashed() {
            return is_hashed;
        }

        public void setIs_hashed(Object is_hashed) {
            this.is_hashed = is_hashed;
        }

        public Pivot getPivot() {
            return pivot;
        }

        public void setPivot(Pivot pivot) {
            this.pivot = pivot;
        }
    }

    public class State{
        public int id;
        public String name;
        public int country_id;
        public String created_at;
        public String updated_at;
        public Object deleted_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCountry_id() {
            return country_id;
        }

        public void setCountry_id(int country_id) {
            this.country_id = country_id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public class Store{
        public int id;
        public int owner_id;
        public int payment_provider_id;
        public String name;
        public String url;
        public int store_type_id;
        public String store_number;
        public String tin;
        public String description;
        public String image;
        public String favicon;
        public String employee_fcm_server_key;
        public String customer_fcm_server_key;
        public String validity_till;
        public int device_count;
        public String door_number;
        public String street_name;
        public int country_id;
        public int state_id;
        public int city_id;
        public long phone;
        public String email;
        public int delivery_radius;
        public int delivery_charges;
        public int package_charges;
        public int service_charges;
        public int min_purchase_amount;
        public int deliver_in_minutes;
        public int order_process_in_minutes;
        public int is_store_nxt_razorpay_account_number;
        public int store_nxt_razorpay_commission_type;
        public Object store_nxt_razorpay_percentage;
        public Object store_nxt_razorpay_fixed_amount;
        public Object micro_nxt_partner_percentage;
        public int availability;
        public int is_admin_approved;
        public String latitude;
        public String longitude;
        public int tax_type;
        public int is_subscription;
        public int is_continuous_billing;
        public Object bill_prefix;
        public int is_online_sale;
        public int is_food_type;
        public String from_time;
        public String to_time;
        public String postal_code;
        public int is_third_party_delivery;
        public int free_delivery_limit;
        public int is_sell_anywhere;
        public int show_out_of_stock;
        public int is_default_warehouse_select;
        public String created_at;
        public String updated_at;
        public Object deleted_at;
        public String default_slot;
        public String additional_slot;
        public String currency;
        public String sms_suffix;
        public int is_transport;
        public Object vendor_name;
        public int offer_max_count;
        public int accounts_type;
        public int auto_order_approve;
        public Object powered_by;
        public double store_rating;
        public String play_store_url;
        public String app_store_url;
        public Object borzo_callbacktoken;
        public Object borzo_token_id;
        public Object borzo_client_id;
        public Object shiprocket_password;
        public String instant_delivery;
        public Object shiprocket_email;
        public int primary_store_id;
        public int borzo_flat_fee;
        public Object borzo_flat_fee_charges;
        public int store_delivery;
        public int borzo_delivery;
        public int shiprocket_delivery;
        public String borzo_api_url;
        public int is_tracking;
        public int tracking_days;
        public String store_logo_url;
        public int max_coupon;
        public int is_return_able;
        public int max_days;
        public String return_description;
        public int is_message_mode;
        public int mode_of_message_sms;
        public int mode_of_message_email;
        public String store_updated_at;
        public int is_sync;
        public int publish_unique_id;
        public int is_delhivery;
        public String delhivery_url;
        public String delhivery_token;
        public String delhivery_client;
        public String delhivery_name;
        public int hub_store_id;
        public int is_hub_store;
        public String store_disclaimer;
        public StoreType store_type;
        public Country country;
        public State state;
        public City city;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOwner_id() {
            return owner_id;
        }

        public void setOwner_id(int owner_id) {
            this.owner_id = owner_id;
        }

        public int getPayment_provider_id() {
            return payment_provider_id;
        }

        public void setPayment_provider_id(int payment_provider_id) {
            this.payment_provider_id = payment_provider_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getStore_type_id() {
            return store_type_id;
        }

        public void setStore_type_id(int store_type_id) {
            this.store_type_id = store_type_id;
        }

        public String getStore_number() {
            return store_number;
        }

        public void setStore_number(String store_number) {
            this.store_number = store_number;
        }

        public String getTin() {
            return tin;
        }

        public void setTin(String tin) {
            this.tin = tin;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getFavicon() {
            return favicon;
        }

        public void setFavicon(String favicon) {
            this.favicon = favicon;
        }

        public String getEmployee_fcm_server_key() {
            return employee_fcm_server_key;
        }

        public void setEmployee_fcm_server_key(String employee_fcm_server_key) {
            this.employee_fcm_server_key = employee_fcm_server_key;
        }

        public String getCustomer_fcm_server_key() {
            return customer_fcm_server_key;
        }

        public void setCustomer_fcm_server_key(String customer_fcm_server_key) {
            this.customer_fcm_server_key = customer_fcm_server_key;
        }

        public String getValidity_till() {
            return validity_till;
        }

        public void setValidity_till(String validity_till) {
            this.validity_till = validity_till;
        }

        public int getDevice_count() {
            return device_count;
        }

        public void setDevice_count(int device_count) {
            this.device_count = device_count;
        }

        public String getDoor_number() {
            return door_number;
        }

        public void setDoor_number(String door_number) {
            this.door_number = door_number;
        }

        public String getStreet_name() {
            return street_name;
        }

        public void setStreet_name(String street_name) {
            this.street_name = street_name;
        }

        public int getCountry_id() {
            return country_id;
        }

        public void setCountry_id(int country_id) {
            this.country_id = country_id;
        }

        public int getState_id() {
            return state_id;
        }

        public void setState_id(int state_id) {
            this.state_id = state_id;
        }

        public int getCity_id() {
            return city_id;
        }

        public void setCity_id(int city_id) {
            this.city_id = city_id;
        }

        public long getPhone() {
            return phone;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getDelivery_radius() {
            return delivery_radius;
        }

        public void setDelivery_radius(int delivery_radius) {
            this.delivery_radius = delivery_radius;
        }

        public int getDelivery_charges() {
            return delivery_charges;
        }

        public void setDelivery_charges(int delivery_charges) {
            this.delivery_charges = delivery_charges;
        }

        public int getPackage_charges() {
            return package_charges;
        }

        public void setPackage_charges(int package_charges) {
            this.package_charges = package_charges;
        }

        public int getService_charges() {
            return service_charges;
        }

        public void setService_charges(int service_charges) {
            this.service_charges = service_charges;
        }

        public int getMin_purchase_amount() {
            return min_purchase_amount;
        }

        public void setMin_purchase_amount(int min_purchase_amount) {
            this.min_purchase_amount = min_purchase_amount;
        }

        public int getDeliver_in_minutes() {
            return deliver_in_minutes;
        }

        public void setDeliver_in_minutes(int deliver_in_minutes) {
            this.deliver_in_minutes = deliver_in_minutes;
        }

        public int getOrder_process_in_minutes() {
            return order_process_in_minutes;
        }

        public void setOrder_process_in_minutes(int order_process_in_minutes) {
            this.order_process_in_minutes = order_process_in_minutes;
        }

        public int getIs_store_nxt_razorpay_account_number() {
            return is_store_nxt_razorpay_account_number;
        }

        public void setIs_store_nxt_razorpay_account_number(int is_store_nxt_razorpay_account_number) {
            this.is_store_nxt_razorpay_account_number = is_store_nxt_razorpay_account_number;
        }

        public int getStore_nxt_razorpay_commission_type() {
            return store_nxt_razorpay_commission_type;
        }

        public void setStore_nxt_razorpay_commission_type(int store_nxt_razorpay_commission_type) {
            this.store_nxt_razorpay_commission_type = store_nxt_razorpay_commission_type;
        }

        public Object getStore_nxt_razorpay_percentage() {
            return store_nxt_razorpay_percentage;
        }

        public void setStore_nxt_razorpay_percentage(Object store_nxt_razorpay_percentage) {
            this.store_nxt_razorpay_percentage = store_nxt_razorpay_percentage;
        }

        public Object getStore_nxt_razorpay_fixed_amount() {
            return store_nxt_razorpay_fixed_amount;
        }

        public void setStore_nxt_razorpay_fixed_amount(Object store_nxt_razorpay_fixed_amount) {
            this.store_nxt_razorpay_fixed_amount = store_nxt_razorpay_fixed_amount;
        }

        public Object getMicro_nxt_partner_percentage() {
            return micro_nxt_partner_percentage;
        }

        public void setMicro_nxt_partner_percentage(Object micro_nxt_partner_percentage) {
            this.micro_nxt_partner_percentage = micro_nxt_partner_percentage;
        }

        public int getAvailability() {
            return availability;
        }

        public void setAvailability(int availability) {
            this.availability = availability;
        }

        public int getIs_admin_approved() {
            return is_admin_approved;
        }

        public void setIs_admin_approved(int is_admin_approved) {
            this.is_admin_approved = is_admin_approved;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public int getTax_type() {
            return tax_type;
        }

        public void setTax_type(int tax_type) {
            this.tax_type = tax_type;
        }

        public int getIs_subscription() {
            return is_subscription;
        }

        public void setIs_subscription(int is_subscription) {
            this.is_subscription = is_subscription;
        }

        public int getIs_continuous_billing() {
            return is_continuous_billing;
        }

        public void setIs_continuous_billing(int is_continuous_billing) {
            this.is_continuous_billing = is_continuous_billing;
        }

        public Object getBill_prefix() {
            return bill_prefix;
        }

        public void setBill_prefix(Object bill_prefix) {
            this.bill_prefix = bill_prefix;
        }

        public int getIs_online_sale() {
            return is_online_sale;
        }

        public void setIs_online_sale(int is_online_sale) {
            this.is_online_sale = is_online_sale;
        }

        public int getIs_food_type() {
            return is_food_type;
        }

        public void setIs_food_type(int is_food_type) {
            this.is_food_type = is_food_type;
        }

        public String getFrom_time() {
            return from_time;
        }

        public void setFrom_time(String from_time) {
            this.from_time = from_time;
        }

        public String getTo_time() {
            return to_time;
        }

        public void setTo_time(String to_time) {
            this.to_time = to_time;
        }

        public String getPostal_code() {
            return postal_code;
        }

        public void setPostal_code(String postal_code) {
            this.postal_code = postal_code;
        }

        public int getIs_third_party_delivery() {
            return is_third_party_delivery;
        }

        public void setIs_third_party_delivery(int is_third_party_delivery) {
            this.is_third_party_delivery = is_third_party_delivery;
        }

        public int getFree_delivery_limit() {
            return free_delivery_limit;
        }

        public void setFree_delivery_limit(int free_delivery_limit) {
            this.free_delivery_limit = free_delivery_limit;
        }

        public int getIs_sell_anywhere() {
            return is_sell_anywhere;
        }

        public void setIs_sell_anywhere(int is_sell_anywhere) {
            this.is_sell_anywhere = is_sell_anywhere;
        }

        public int getShow_out_of_stock() {
            return show_out_of_stock;
        }

        public void setShow_out_of_stock(int show_out_of_stock) {
            this.show_out_of_stock = show_out_of_stock;
        }

        public int getIs_default_warehouse_select() {
            return is_default_warehouse_select;
        }

        public void setIs_default_warehouse_select(int is_default_warehouse_select) {
            this.is_default_warehouse_select = is_default_warehouse_select;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public String getDefault_slot() {
            return default_slot;
        }

        public void setDefault_slot(String default_slot) {
            this.default_slot = default_slot;
        }

        public String getAdditional_slot() {
            return additional_slot;
        }

        public void setAdditional_slot(String additional_slot) {
            this.additional_slot = additional_slot;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getSms_suffix() {
            return sms_suffix;
        }

        public void setSms_suffix(String sms_suffix) {
            this.sms_suffix = sms_suffix;
        }

        public int getIs_transport() {
            return is_transport;
        }

        public void setIs_transport(int is_transport) {
            this.is_transport = is_transport;
        }

        public Object getVendor_name() {
            return vendor_name;
        }

        public void setVendor_name(Object vendor_name) {
            this.vendor_name = vendor_name;
        }

        public int getOffer_max_count() {
            return offer_max_count;
        }

        public void setOffer_max_count(int offer_max_count) {
            this.offer_max_count = offer_max_count;
        }

        public int getAccounts_type() {
            return accounts_type;
        }

        public void setAccounts_type(int accounts_type) {
            this.accounts_type = accounts_type;
        }

        public int getAuto_order_approve() {
            return auto_order_approve;
        }

        public void setAuto_order_approve(int auto_order_approve) {
            this.auto_order_approve = auto_order_approve;
        }

        public Object getPowered_by() {
            return powered_by;
        }

        public void setPowered_by(Object powered_by) {
            this.powered_by = powered_by;
        }

        public double getStore_rating() {
            return store_rating;
        }

        public void setStore_rating(double store_rating) {
            this.store_rating = store_rating;
        }

        public String getPlay_store_url() {
            return play_store_url;
        }

        public void setPlay_store_url(String play_store_url) {
            this.play_store_url = play_store_url;
        }

        public String getApp_store_url() {
            return app_store_url;
        }

        public void setApp_store_url(String app_store_url) {
            this.app_store_url = app_store_url;
        }

        public Object getBorzo_callbacktoken() {
            return borzo_callbacktoken;
        }

        public void setBorzo_callbacktoken(Object borzo_callbacktoken) {
            this.borzo_callbacktoken = borzo_callbacktoken;
        }

        public Object getBorzo_token_id() {
            return borzo_token_id;
        }

        public void setBorzo_token_id(Object borzo_token_id) {
            this.borzo_token_id = borzo_token_id;
        }

        public Object getBorzo_client_id() {
            return borzo_client_id;
        }

        public void setBorzo_client_id(Object borzo_client_id) {
            this.borzo_client_id = borzo_client_id;
        }

        public Object getShiprocket_password() {
            return shiprocket_password;
        }

        public void setShiprocket_password(Object shiprocket_password) {
            this.shiprocket_password = shiprocket_password;
        }

        public String getInstant_delivery() {
            return instant_delivery;
        }

        public void setInstant_delivery(String instant_delivery) {
            this.instant_delivery = instant_delivery;
        }

        public Object getShiprocket_email() {
            return shiprocket_email;
        }

        public void setShiprocket_email(Object shiprocket_email) {
            this.shiprocket_email = shiprocket_email;
        }

        public int getPrimary_store_id() {
            return primary_store_id;
        }

        public void setPrimary_store_id(int primary_store_id) {
            this.primary_store_id = primary_store_id;
        }

        public int getBorzo_flat_fee() {
            return borzo_flat_fee;
        }

        public void setBorzo_flat_fee(int borzo_flat_fee) {
            this.borzo_flat_fee = borzo_flat_fee;
        }

        public Object getBorzo_flat_fee_charges() {
            return borzo_flat_fee_charges;
        }

        public void setBorzo_flat_fee_charges(Object borzo_flat_fee_charges) {
            this.borzo_flat_fee_charges = borzo_flat_fee_charges;
        }

        public int getStore_delivery() {
            return store_delivery;
        }

        public void setStore_delivery(int store_delivery) {
            this.store_delivery = store_delivery;
        }

        public int getBorzo_delivery() {
            return borzo_delivery;
        }

        public void setBorzo_delivery(int borzo_delivery) {
            this.borzo_delivery = borzo_delivery;
        }

        public int getShiprocket_delivery() {
            return shiprocket_delivery;
        }

        public void setShiprocket_delivery(int shiprocket_delivery) {
            this.shiprocket_delivery = shiprocket_delivery;
        }

        public String getBorzo_api_url() {
            return borzo_api_url;
        }

        public void setBorzo_api_url(String borzo_api_url) {
            this.borzo_api_url = borzo_api_url;
        }

        public int getIs_tracking() {
            return is_tracking;
        }

        public void setIs_tracking(int is_tracking) {
            this.is_tracking = is_tracking;
        }

        public int getTracking_days() {
            return tracking_days;
        }

        public void setTracking_days(int tracking_days) {
            this.tracking_days = tracking_days;
        }

        public String getStore_logo_url() {
            return store_logo_url;
        }

        public void setStore_logo_url(String store_logo_url) {
            this.store_logo_url = store_logo_url;
        }

        public int getMax_coupon() {
            return max_coupon;
        }

        public void setMax_coupon(int max_coupon) {
            this.max_coupon = max_coupon;
        }

        public int getIs_return_able() {
            return is_return_able;
        }

        public void setIs_return_able(int is_return_able) {
            this.is_return_able = is_return_able;
        }

        public int getMax_days() {
            return max_days;
        }

        public void setMax_days(int max_days) {
            this.max_days = max_days;
        }

        public String getReturn_description() {
            return return_description;
        }

        public void setReturn_description(String return_description) {
            this.return_description = return_description;
        }

        public int getIs_message_mode() {
            return is_message_mode;
        }

        public void setIs_message_mode(int is_message_mode) {
            this.is_message_mode = is_message_mode;
        }

        public int getMode_of_message_sms() {
            return mode_of_message_sms;
        }

        public void setMode_of_message_sms(int mode_of_message_sms) {
            this.mode_of_message_sms = mode_of_message_sms;
        }

        public int getMode_of_message_email() {
            return mode_of_message_email;
        }

        public void setMode_of_message_email(int mode_of_message_email) {
            this.mode_of_message_email = mode_of_message_email;
        }

        public String getStore_updated_at() {
            return store_updated_at;
        }

        public void setStore_updated_at(String store_updated_at) {
            this.store_updated_at = store_updated_at;
        }

        public int getIs_sync() {
            return is_sync;
        }

        public void setIs_sync(int is_sync) {
            this.is_sync = is_sync;
        }

        public int getPublish_unique_id() {
            return publish_unique_id;
        }

        public void setPublish_unique_id(int publish_unique_id) {
            this.publish_unique_id = publish_unique_id;
        }

        public int getIs_delhivery() {
            return is_delhivery;
        }

        public void setIs_delhivery(int is_delhivery) {
            this.is_delhivery = is_delhivery;
        }

        public String getDelhivery_url() {
            return delhivery_url;
        }

        public void setDelhivery_url(String delhivery_url) {
            this.delhivery_url = delhivery_url;
        }

        public String getDelhivery_token() {
            return delhivery_token;
        }

        public void setDelhivery_token(String delhivery_token) {
            this.delhivery_token = delhivery_token;
        }

        public String getDelhivery_client() {
            return delhivery_client;
        }

        public void setDelhivery_client(String delhivery_client) {
            this.delhivery_client = delhivery_client;
        }

        public String getDelhivery_name() {
            return delhivery_name;
        }

        public void setDelhivery_name(String delhivery_name) {
            this.delhivery_name = delhivery_name;
        }

        public int getHub_store_id() {
            return hub_store_id;
        }

        public void setHub_store_id(int hub_store_id) {
            this.hub_store_id = hub_store_id;
        }

        public int getIs_hub_store() {
            return is_hub_store;
        }

        public void setIs_hub_store(int is_hub_store) {
            this.is_hub_store = is_hub_store;
        }

        public String getStore_disclaimer() {
            return store_disclaimer;
        }

        public void setStore_disclaimer(String store_disclaimer) {
            this.store_disclaimer = store_disclaimer;
        }

        public StoreType getStore_type() {
            return store_type;
        }

        public void setStore_type(StoreType store_type) {
            this.store_type = store_type;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }
    }

    public class StoreType{
        public int id;
        public String name;
        public String created_at;
        public String updated_at;
        public Object deleted_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public class SubCategory{
        public int id;
        public String slug;
        public int store_id;
        public int category_id;
        public String name;
        public Object icon;
        public Object color;
        public String created_at;
        public String updated_at;
        public Object deleted_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public int getCategory_id() {
            return category_id;
        }

        public void setCategory_id(int category_id) {
            this.category_id = category_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getIcon() {
            return icon;
        }

        public void setIcon(Object icon) {
            this.icon = icon;
        }

        public Object getColor() {
            return color;
        }

        public void setColor(Object color) {
            this.color = color;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }

    public class Taxis{
        public int id;
        public String name;
        public Object description;
        public String applicable_to;
        public String created_at;
        public String updated_at;
        public Object deleted_at;
        public Pivot pivot;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getApplicable_to() {
            return applicable_to;
        }

        public void setApplicable_to(String applicable_to) {
            this.applicable_to = applicable_to;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }

        public Pivot getPivot() {
            return pivot;
        }

        public void setPivot(Pivot pivot) {
            this.pivot = pivot;
        }
    }

    public class UnitType{
        public int id;
        public String name;
        public Object description;
        public String created_at;
        public String updated_at;
        public Object deleted_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getDeleted_at() {
            return deleted_at;
        }

        public void setDeleted_at(Object deleted_at) {
            this.deleted_at = deleted_at;
        }
    }


}
