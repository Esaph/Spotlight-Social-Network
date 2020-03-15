package esaph.spotlight.Esaph.EsaphLifeCloudBackup;

import java.util.ArrayList;

import esaph.spotlight.navigation.globalActions.CMTypes;
import esaph.spotlight.navigation.kamera.PostEditingFragments.EsaphTagging.EsaphHashtag;

public class LifeCloudUploadVideo extends LifeCloudUpload
{
    public LifeCloudUploadVideo(ArrayList<EsaphHashtag> esaphHashtag, String beschreibung, String PID, long uhrzeit, short messageStatus, short LIFECLOUD_TYPE)
    {
        super(esaphHashtag, beschreibung, PID, uhrzeit, messageStatus, CMTypes.FVID, LIFECLOUD_TYPE);
    }
}