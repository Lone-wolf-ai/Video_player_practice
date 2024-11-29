package com.tanjim_ahmed.video_player

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val videoView: VideoView=findViewById(R.id.videoView)
        videoView.setVideoPath("android.resource://"+packageName+"/"+R.raw.sample)
        val mediaController= MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()
        //display videos from internet
        val videoView1: VideoView=findViewById(R.id.videoView1)
        val uri=Uri.parse("https://rr5---sn-h557sns7.googlevideo.com/videoplayback?expire=1732932724&ei=FCBKZ8z3A-CEi9oP0-mv-A8&ip=194.32.82.128&id=o-ANTexquzwbqK90k7p1RLbcJ1v1SI-gZji30C3pWph4tp&itag=18&source=youtube&requiressl=yes&xpc=EgVo2aDSNQ%3D%3D&bui=AQn3pFQsEPmLyskhNt2HjJYEC7XioAxftUVUse_e8UQ7utsu1ek_qKvLn4NL2lmFnvgj1pmZ8sgWUWS_&vprv=1&mime=video%2Fmp4&rqh=1&gir=yes&clen=430589&ratebypass=yes&dur=5.363&lmt=1719355289392222&fexp=24350590,24350655,24350675,24350705,24350737,51326932,51335594&c=ANDROID_VR&txp=1308224&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cxpc%2Cbui%2Cvprv%2Cmime%2Crqh%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AJfQdSswRQIgNRup-cH8IY0cPhnCG0cFtwRm-gjHgsFvCE9CMucfpI0CIQDXgt23unQMbEzaxo_b0wLkCIXmqi7ZH1yTT4X9fzA_tQ%3D%3D&title=Sample+Videos+%2F+Dummy+Videos+For+Demo+Use&rm=sn-2gphxuxa-vu2l7l,sn-nv4sy7s&rrc=79,104,80&req_id=3e6f26541107a3ee&ipbypass=yes&redirect_counter=3&cm2rm=sn-x5guiuxaxjvh-q5jd7s&cms_redirect=yes&cmsv=e&met=1732911138,&mh=aU&mip=103.187.94.22&mm=30&mn=sn-h557sns7&ms=nxu&mt=1732910911&mv=m&mvi=5&pl=24&rms=nxu,au&lsparams=ipbypass,met,mh,mip,mm,mn,ms,mv,mvi,pl,rms&lsig=AGluJ3MwRQIgGKa6BiCHHAfzFDDkkopKrzCFADp9YBspzrZWVro3EwQCIQDJ_bKRD7xOGzGwJ-AYFdvG-tCwc-ATtN3HsMK1P6FO5Q%3D%3D")
        videoView1.setVideoURI(uri)
        //media controller
        val mediaController1= MediaController(this)
        mediaController1.setAnchorView(videoView1)
        mediaController1.setMediaPlayer(videoView1)
        videoView1.setMediaController(mediaController1)
        videoView1.start()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}