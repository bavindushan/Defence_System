/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence_system;

/**
 *
 * @author Bavindu Shan
 */
interface SuperDefence {
    public void isAreaClear(Boolean b);
    public void sendStrength(Strength currentLevel);
    public void sendMessage(String meassage);
    public void sendMessageToMainController(String message);
}
