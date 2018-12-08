public class Television {

int channel=1;
int volumeLevel=1;
boolean on_off=false;

public void setChannel(int newChannel){

        if (on_off==true && newChannel>0 && newChannel<120) {

                this.channel=newChannel;

        }


}

public int getChannel(){

        return this.channel;

}

public void setVolume(int newVolumeLevel){

        if (on_off==true && newVolumeLevel>0 && newVolumeLevel<7) {

                this.volumeLevel=newVolumeLevel;

        }

}

public void setOn_Off(boolean on_off){

        if (on_off==true) {

                this.on_off=true;
        }
        else {        //end class

                this.on_off=false;
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

public void volumeUp(){

        if (on_off==true && this.volumeLevel <7) {

                this.volumeLevel++;
        }
}

public void volumeDown(){

        if (on_off==true && this.volumeLevel >1 ) {

                this.volumeLevel--;
        }
}

public String toString(){

        return "Channel ="+this.channel+", Volume Level ="+this.volumeLevel+", on ="+this.on_off;

}



}
