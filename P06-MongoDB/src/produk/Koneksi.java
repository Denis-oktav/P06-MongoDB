/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produk;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Lenovo
 */
public class Koneksi {
    public static MongoDatabase sambungDB(){
        try {
            com.mongodb.client.MongoClient client = MongoClients.create();
            MongoDatabase database = client.getDatabase("product");
            System.out.println("Koneksi Sukses!");
            return database;
        } catch (Exception e) {
            System.out.println("Koneksi Gagal: "+e.getMessage());
        }
        return null;
        
    
    }
    
}
