/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augrat;

import java.util.ArrayList;

public class JsonBugBlockModels {
    
   public String nameOfBug;
   public String className;
   public String methodName;
   public int numberOfLines;
   public ArrayList<String> headers;
   public String bugInfo;
   public ArrayList<String> bugBlock;

    public JsonBugBlockModels() {
        this.bugBlock = new ArrayList<>();
        this.headers = new ArrayList<>();
    }
}
