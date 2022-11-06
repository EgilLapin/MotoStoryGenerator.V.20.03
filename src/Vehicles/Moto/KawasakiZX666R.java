package Vehicles.Moto;

public class KawasakiZX666R extends Motorcycle{

    double minimumRecommendedFuel = 10;
    private float throttleAmount;
    float total = 100;
    float percent = (100 * throttleAmount) / total;
    private static final String fullSendConstant= "FULL SEND!";

    public KawasakiZX666R(double fuelEfficiency, double amountOfFuel) {
        super(fuelEfficiency, amountOfFuel);
    }

    @Override
    public void addFuel(double addedFuel) {
        double fuelTankCap = 15;
        if (addedFuel < 0 ) {
            System.out.println("Please dont steal " + Math.abs(addedFuel) + "L of Fuel...");
            callPolice();
            callTheDevil();
        } else if (addedFuel > fuelTankCap) {
            System.out.println("Trying to add " + addedFuel+ "L of Fuel...");
            System.out.println("Cannot add more than "+ fuelTankCap + "L to a Motorcycle tank, you lost "
                    + (amountOfFuel+addedFuel-fuelTankCap)+
                    "L of fuel,\nbecause you already had " + amountOfFuel + "L of fuel in the tank, sorry!");
            this.amountOfFuel = fuelTankCap;
        } else {
            this.amountOfFuel = this.amountOfFuel+addedFuel;
            System.out.println("Added " + addedFuel+ "L of Fuel...");
        }

        if (amountOfFuel < minimumRecommendedFuel) {
            System.out.println("Please add more than " + minimumRecommendedFuel + "L!!!");
        }
    }
    public void callTheDevil(){
        System.out.println("Sensing tampering with the ZX666R, calling the Devil...");
    }

    public void fullSend200 (float maxWrist) {
        if (amountOfFuel>minimumRecommendedFuel) {
            setThrottleAmount(maxWrist);
            System.out.println("Throttle set at " + throttleAmount + "%");
            System.out.println("Going " + fullSendConstant);
            System.out.println(myASCIICheers);
            System.out.println(myASCIIArt);
        } else {
            System.out.println("Please add more than " + minimumRecommendedFuel + "L!!!");
        }

    }

    public void setThrottleAmount(float throttleAmount) {
        this.throttleAmount = throttleAmount;
    }

































































































































































































































































































































































































































































































































































































































    private String myASCIIArt = "'........................'.........',,,,,,,,,,,;,,,,;::::::cclooddxxkxdddxxxxxxxxxxxkkkxxxkkxxxxxxxkxxdddxkkkxxxxxxxxxxddddddxkxdollooooddddooooooooll\\n\n" +
            "'............................',,,,,,,;::c:::::::cc::clooolllloddxxxkkkxxxxxxxxxxxxkkkOOkkkxxxxxkkkkxxxddddxxxdddxxxxxddddddxxxxddoooooloddddoooodooood\\n\n" +
            ",,'....''''...''',,,,,,,,,,,,,::ccccclooddooooodddddddxxddooodxkkkkkkkkkkxxxxxkkkkkOOOOkxdddooddxxxxxxxxxdddddddxxxxxxxxxxxxkkxxxddoolooddxxxddddddoll\\n\n" +
            "xxddddxxxxxddddxxxxxxxxxxxxxdxxkkkkkkOOOO00O0000O0000000000000OOOOkkkkkkkxxxxxkkkkkkkkkxddoooodddxxxxxxddxxxxxddxxxxxxxxxxxxxxxdddddooddxxxdddoooollll\\n\n" +
            "0O0000000000000000KKKKKKKKKKKKKKKKKK000KKKKKKKKXXKKKKKKKKKKKKKKK00OO00OOOOkkkkkOOkkkOOOkxxxxxxxxxxxxxxddxxkkkkxxxxxxdxxkxxdxxxddoddddddxxxddoooooooood\\n\n" +
            "OOOO00KKKKKKKKKKKKKKKKKKKKKKKKK000000000000OOOO00000000000KK00KKKKKKKKKKKKKK00O000000000OOOOOOOkkxxddxxkkkOOkxddddddddxkxxxxxxxdoodddddxxxxxdddddddxxx\\n\n" +
            "OOOOO00000OOO0000000000KKKKKKKKKKKKKKKKKKKKK000000000KK00KKKKKKKXXXXXXXXXXXXKKKKKKKKKXXKKKK000OOOkkkxkO00KK0dlcc:ccccldxxxxxxxddddxxxxxxxxxxxxxxxxxxxx\\n\n" +
            "xxkkkkkxxxkkkkOOOOOO0000OOO00000O000000K000KK0000K0000000000KKKKKKKKKXXXXXXXXXXXXNNXXXKKKKKKKKKKKKKK0000KOo;....,;;;,,;cdkkkxxxxxxkkxxxxxxxxxxxxxxxddd\\n\n" +
            "ddxxxxxxxxkkkkkkkkOOOOOOkkkkOOOOOOOOOOOOOOOOOOO000000OOkOOOO000000000000KKKKKKKKKKKKK000KK0000OOO0kkO0KOd;.      .,,',,.;xOOOOOOOOOkxxxxxxxxxxdddddxxx\\n\n" +
            "xxdddxxxxxxxxxxxxkkkkkkkkkkkkkkkkkkkOOOOOOOO0000OOOOkkkkkkkkOOOOOO0OOkkkkOOOOOOOkkOOOkkkkxdlcldl:c::coxo'         .....,;oOOOOOOkkkkxxxxxxddxxxdddxxxx\\n\n" +
            "xxxxxxkkkkxxxxxxkkkxxkkxxxxxxxxxxxxkkOOOkkkkkOOOOOOOkkkkkkkxxxxkkkkkkxxdxxkkkkkkxxkkxdoooc;'..,,...''''..              .,dOOOOkxxxxkkkkkkxxxxxxdxxxxxx\\n\n" +
            "xxxxxxkkxxxxxxxxkkkkkkxxxkkkkkkkkkkkkxkkkkkkkxkkOOOOkkkkkkkkkkOOOOOOO0000000000kxolxdc;,,,,'............               .;k0000OOOO000000Okkxxxxxxkkkkk\\n\n" +
            "ooooodddddddxxxxxxxxxxxxkkkkkkkkkkkkkkkkkkkxxxxkkxxxxkkkkkkkkkkkOOOO00000O0000Okkocddlc:,.. .      .  ..'             .;x000OO000KKK0000OOOOOOOOOOOOOk\\n\n" +
            "dddooollllloooddxxxxxxxkkkkkkkkkkkkkkkkkk0KK0OOkxxxxxkkkkkkkkkkkkkkkkOOkkkkkkkkO0xl:'.,:;'..  ..    .',;:;,'..       .ck0OOOOOOO00000000000000000000OO\\n\n" +
            "xkxxxxxddddooollloodddddddooodxxxxxdddxxkOKNNNXK0OOOkkkkkxxkxxddxxddooddoodddl:;:,..  ,c;.......   .,::cllool,'...  ,dOKKKKKKKKKKKKKKKKKK00KKK0000000O\\n\n" +
            "xxxxxxxxxxxxxxxddddddoolllccccllcccccloolodxOKKkxO0KOkxdddol:;,'';:;,,,,,;;;::;;:,..  .,.......... ,l;..';cllcc;,''ck0000KKKKKXXXKKKKKKKKKKKKKKK00000O\\n\n" +
            "xxxxxxxxxxxxxxxxkkkkxxxxxddoollcccc:::,....'lddl::cdd:;cc;;:,,'. .''... ..''';o00x:. ...........'.',;'.  .cxkxkOxoclxkkkkOOO000K0000000000000000000OOO\\n\n" +
            "xxxxxxxxxxxxxxxxxxxxxxkkkkkkkkkkkxdc,..     .';:;'.cdl,;;......   ..         .,dx:'.  ..',,'.  ..........':lxOkk0KOxxxxxxxxkkkOOOOOO000000000KK000OOOO\\n\n" +
            "xxxxxxxxxxxxxxxxxxxxxxxkkkkkkkkkxdl,.....      ...':lool'                  ...';;,'.    ..';;.........,;::;;cldxdx0KOxdddooodxxxxkkkkOOO00000000000000\\n\n" +
            "xxxkkkkkkkkkkkkkkkkkkkkkkkkxddxdolc:'','.      .;cl::;;.                    ..,:lll:,''.........'.........'col:cooldxddoollooooooddddddddxkkkkkkOOOOOO\\n\n" +
            "xxxxxxxxxxxxkkkkkkkkkkkkkkkxc;looccc:;:::,',;;;c:;'',.       ....  .    ..',;::;;;;,'...........,,'..     .cool::ol..:odooooooooooooolllooooooooddoood\\n\n" +
            "xxxxxxxxxxxxxxxxxxxxxxkkkkkkd:;codooolcc:;;;clc,.. ..     .';lol'.'::,''''.....        ..   ..............;oolllcld:  ,loooddoooooolllllllllllllllcccc\\n\n" +
            "ddxxxxxxxxxxxxxxxxxxxxxxxxxxxd:,cddxO0kc;,:cc;'..    .  .';,.'colclc,..           .'....   .,'.          .ckkl,,::oo.  ,loooooooooooooooooooooooolllll\\n\n" +
            "dddddxxxxxxxxxxxxxxxxxxxxxxxxxd:;;,:dxl,..,co:'.   .,c:. ...':loooc;'..         ..'..     .''..           .;odl;'','.  'loooooooooooooodddddddddddoddd\\n\n" +
            "ddddddddxxxxxxxxxxxxxxxxxxxdl:'... .:dd;. ..''...  .cllc;:lol:;;;,'..''..      ...                           .','.......;lollooooloooooooollooddddoood\\n\n" +
            "ddddddddxxxxddxxxddddddddl;'.........;ll;....     ..'''l0Kkkd:,'...............                                      ....;::::clloooooooooooollooollll\\n\n" +
            "ddddddddxxxdddddddddddoc,....  .''. ...;c'...     .. .ckXKkxo,.......   ......                  ''.''.. ...         'ldoccllc::cloooolloooooooooooolll\\n\n" +
            "ddddddddxxxxxxxxxxxxdl,... ...;lddolc:,.,:'';:'.    .;dddool:.  .:c'....                       'c;;oolcc;,,'..     .odk0kOOOOkkkkkxxddoooolllllllllool\\n\n" +
            "dddddddddddddddddddo:.... .,:;:loddolc:,.'::cl:..  .,oxl'........;,..,:,.                     .;:,cddodd,    ..    ,xkkkxkkkkkOOOOOOOOOOOkkkxxdolcclll\\n\n" +
            "ddddddddddddddddddl,...  'oc...       ..  .:;.. ...,odc...    .'..  .,;'                      .l;.:odo;.   ....'.  'okkkkkkkkkkkkkkkkkkkkOOOOOOOkkkxxx\\n\n" +
            "dddddddddddddddddl,...  .lXx'. .           .,'.  ..',,..','.   .''..                      ..  ;o,,lo:.     ....,'.,dkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\n\n" +
            "ooooodddddddddddo;..'.   ,xOkdl;.           ....  ..              ...                  .':c;',c:..''..:,    .'','.'lkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\n\n" +
            "ddddddddddddddddc'.,,.    .ldc.             .  ... ..            .                   ..:do;.,;;,...,,cko.   ',''...:xxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\n\n" +
            "oooooddddddddddo:.',;'.  .:ooc.   ....       .  ... ..                    ..        ..':c,........;cldx;   .;,''...cxxxxxxxxkkkkkkkkkkkkkkkkkkkkkkkkkk\\n\n" +
            "dddddddddddddddo;..',;,'.;ool;'....        ..  .  .. ..                   ...     ............ ..;clll,   .,,'....'lxxxxkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk\\n\n" +
            "dddddddddddddddd:. ...',,,;,'...                   ..  .                  ...     ...  .:c;,;::;,:ll;.  ..''......:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxkxxxx\\n\n" +
            "ooooooooooooooool,                                                         .     ..'.   ;xxooddc:;'.  ..'...... .;oddddddddddooooooooooodddddddddddddd\\n\n" +
            "looooooooooooooool;.                    .,:c;'.......                           ..','  .;cc,,'..     ..'....   .:ooooooooooooooollllllllllllllllllllll\\n\n" +
            "ooooooooooooooooollc,.              ..,:looddoooolcc::;,,'.....                  .'','.:ool;.............    .'coddddddddddddddddooooooooooooollllllll\\n\n" +
            "lllllllllllllllllcc:;,'...       ..',;:::::cccccccccllllllllllcc::;,,''..............',;:ccc:;;'.....      .':looooooooooooooodddooodddddddooooooooooo\\n\n" +
            "ccccccccclllllllccc:::;;;;,,,'''''''''''''',,,,,,,,,,,,,,,,,,;;;;;;::::::::::::c:'  ...........          .':oooooooooooooooooooooooooooooooooooooooooo\\n\n" +
            "cccccccccccccccccccc:::::::::::;;;;;;;;;;;;,,,,,,,,,''''''''................'''''..                   ..,clllllllloooooooooooooooooooooooollllllllllll\\n\n" +
            "cccccccccccccccccccccccccccc:::::::::::::::::::::;;;;;;;;,,,,,,,,,,''''''''..........              ...',;;;;;::::cccccccllllllllllooolllllllllllllllll\\n\n" +
            "cccclccccccccccccccccccccccccccccccccc:::::cc::::::::::::::::;;;;;;;;;;;;;;;,,,,,,,,'''............'''''',,,,,,;;;;;:::::::cccccccccccccccccclcccccccc\\n\n" +
            "cccccccccccccccccc::::::::::::::::::::::::ccccccccccccccc::::::::::::::::::::::;;;;;;;;;;;;;,,,,,,,,,;;;;;;;;;;;;;;::::::::::::ccccccccccccccccccccccc\\n\n" +
            "lllllllcccccccccccccccccccccc::::::c:::::::ccccccccccccccccccccccccc:::::::::::::c:::::::::::::::::::::::::::::::::::::::::::::byebyewroomwroom200plus\\n";

    private String myASCIICheers =
            "\n \n      ::::    ::: ::::::::::: ::::    ::: ::::::::::: :::            ::::::::: :::    :::  ::::::::   ::::::::   ::::::::  ::::::::: \n" +
            "     :+:+:   :+:     :+:     :+:+:   :+:     :+:   :+: :+:               :+:  :+:    :+: :+:    :+: :+:    :+: :+:    :+: :+:    :+: \n" +
            "    :+:+:+  +:+     +:+     :+:+:+  +:+     +:+  +:+   +:+             +:+    +:+  +:+  +:+        +:+        +:+        +:+    +:+  \n" +
            "   +#+ +:+ +#+     +#+     +#+ +:+ +#+     +#+ +#++:++#++:           +#+      +#++:+   +#++:++#+  +#++:++#+  +#++:++#+  +#++:++#:    \n" +
            "  +#+  +#+#+#     +#+     +#+  +#+#+#     +#+ +#+     +#+          +#+      +#+  +#+  +#+    +#+ +#+    +#+ +#+    +#+ +#+    +#+    \n" +
            " #+#   #+#+#     #+#     #+#   #+#+# #+# #+# #+#     #+#         #+#      #+#    #+# #+#    #+# #+#    #+# #+#    #+# #+#    #+#     \n" +
            "###    #### ########### ###    ####  #####  ###     ###        ######### ###    ###  ########   ########   ########  ###    ###    \n" +
            "\n \n" +
            "          :::    :::          :::    ::: \n" +
            "         :+:    :+:          :+:    :+:  \n" +
            "         +:+  +:+            +:+  +:+    \n" +
            "         +#++:+              +#++:+      \n" +
            "       +#+  +#+            +#+  +#+      \n" +
            "     #+#    #+#          #+#    #+#      \n" +
            "    ###    ###          ###    ###       \n" +
            "                                         \n" +
            "      #++#++#++#++#++#++#++#++#++#       \n" +
            "    ############################         \n" ;

}


