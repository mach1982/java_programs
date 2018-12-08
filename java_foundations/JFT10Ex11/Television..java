public class Television {

int channel=1;
int volumeLevel=1;
boolean on_off=false;

public void setChannel(int newChannel){

        if (on_off==True && newChannel>0 && newChannel<120) {

                this.channel=newChannel;

        }


}

public void getChannel(){

        return this.channel;

}

public void setVolume(int newVolumeLevel){

        if (on_off==True && newVolumeLevel>0 && newVolumeLevel<7) {

                this.volumeLevel=newVolumeLevel;

        }

        public void setOn(boolean on_off){

                if (on_off==True) {

                        this.on_off=True;
                }
                else {

                        this.on_off=False;
                }
        }



}

public boolean getOn_Off(){

        return this.on_off;
}


public void channelUp(){

        if (on_off==true && this.channel <120) {

                this.channel++;
        }

}

public void channelDown(){

        if (on_off==true && this.channel >11) {

                this.channel--;
        }

}

public void volumeUP(){

        if (on_off==true && this.volumeLevel <7) {

                this.volumeLevel++;
        }
}

public void volumeUP(){

        if (on_off==true && this.volumeLevel >1 ) {

                this.volumeLevel--
        }
}

public void toString(){

        return "Channel ="+this.Channel+", Volume ="+thsi.volumeLevel+", on ="+this.on_off;

}

}
