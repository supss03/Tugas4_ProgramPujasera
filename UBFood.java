package ubfood;

import static ubfood.DataMerchant.*;

public class UBFood{

    public static void main(String[] args){
        merc = tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        merc = tambahMerchant(new Merchant("Nasgor Mblebes", " Nasi Goreng Jawa", 10000));
        merc = tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam kota Ekstra Nasi", 10000));
        tampilData();
        merc = tambahMerchant(new Merchant(DataMerchant.input.nextLine(), DataMerchant.input.nextLine(), DataMerchant.input.nextDouble()));
        tampilData();
    }

}
