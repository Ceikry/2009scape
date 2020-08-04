package core.game.system.config

import plugin.DonatorZone

class ConfigParser {
    fun prePlugin(){
        NPCConfigParser().load()
        ItemConfigParser().load()
        ObjectConfigParser().load()
        XteaParser().load()
        InterfaceConfigParser().load()
    }

    fun postPlugin(){
        ShopParser().load()
        DropTableParser().load()
        NPCSpawner().load()
        DonatorZone().newInstance(Unit)
        DoorConfigLoader().load()
        GroundSpawnLoader().load()
        MusicConfigLoader().load()
        RangedConfigLoader().load()
    }
}