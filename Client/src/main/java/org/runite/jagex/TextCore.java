package org.runite.jagex;

import org.runite.GameLaunch;

import java.awt.*;

public class TextCore {

    /** @woah
     * A repository filled with text that can be set to whatever the user sees fit
     * Each will be labeled for what their original purpose is for and the files that
     * They reside in.
     *
     * RSString information:
     * The way it was programmed certain symbols require a different type of value set
     * to determine said symbol. You may notice ex: )2 or a )3)3
     * )2 = spacer )3 = period(.)
     */

    /**Login Screen Text
     * Files that use these texts:
     */
    static RSString RSLoadingPleaseWait = RSString.parse(GameLaunch.SETTINGS.getName() + " is loading )2 please wait)3)3)3");
    static RSString LoadingConfig = RSString.parse("Loading config )2 ");
    static RSString LoadedConfig = RSString.parse("Loaded config");
    static RSString LoadingSprites = RSString.parse("Loading sprites )2 ");
    static RSString LoadedSprites = RSString.parse("Loaded sprites");
    static RSString LoadingWLD = RSString.parse("Loading world list data");
    static RSString LoadedWLD = RSString.parse("Loaded world list data");
    static RSString LoadingPleaseWait = RSString.parse("Please wait)3)3)3");
    static RSString LoadingPleaseWait2 = RSString.parse("Loading )2 please wait)3");
    static RSString LoadingFonts = RSString.parse("Loading fonts )2 ");
    static RSString LoadedFonts = RSString.parse("Loaded fonts");
    static RSString LoadedWordPack = RSString.parse("Loaded wordpack");
    static RSString LoadingTextures = RSString.parse("Loading textures )2 ");
    static RSString LoadedTextures = RSString.parse("Loaded textures");
    static RSString LoadingInterfaces = RSString.parse("Loading interfaces )2 ");
    static RSString LoadedInterfaces = RSString.parse("Loaded interfaces");
    static RSString LoadingTitleScreen = RSString.parse("Loading title screen )2 ");
    static RSString LoadingGeneral = RSString.parse("Loading)3)3)3");
    static RSString LoadingWordPack = RSString.parse("Loading wordpack )2 ");
    static RSString LoadingConnecting = RSString.parse("Connecting.. This takes a LONG time.");
    static RSString LoadedUpdateList = RSString.parse("Loaded update list");
    static RSString AttemptingReestablish = RSString.parse("Please wait )2 attempting to reestablish)3");
    static RSString CreatedWorld = RSString.parse("Created gameworld");
    static RSString CheckingForUpdates = RSString.parse("Checking for updates )2 ");
    static RSString LoadedInputHandler = RSString.parse("Loaded input handler");
    static RSString OpenedTitleScreen = RSString.parse("Opened title screen");
    static RSString LoadedTitleScreen = RSString.parse("Loaded title screen");
    static RSString Starting3DLibrary = RSString.parse("Starting 3d Library");
    static RSString Started3DLibrary = RSString.parse("Started 3d Library");
    static RSString AllocatingMemory = RSString.parse("Allocating memory");
    static RSString AllocatedMemory = RSString.parse("Allocated memory");
    static RSString PreparedSoundEngine = RSString.parse("Prepared sound engine");
    static RSString ConxLost = RSString.parse("Connection lost)3");
    static RSString ConxUpdateServer = RSString.parse("Connected to update server");

    /**User Login/ User Text
     *
     */
    static RSString HasExpires = RSString.parse("; Expires=");
    static RSString HasMaxAge = RSString.parse("; Max)2Age=");
    static RSString HasAgeExpire = RSString.parse("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
    static RSString HasLoggedIn = RSString.parse(" has logged in)3");
    static RSString HasLoggedOut = RSString.parse(" has logged out)3");
    static RSString HasFriendsListFull = RSString.parse("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");
    static RSString HasIgnoreListFull = RSString.parse("Your ignore list is full)3 Max of 100 users)3");
    static RSString HasOnOwnFriendsList = RSString.parse("You can(Wt add yourself to your own friend list)3");
    static RSString HasOnOwnIgnoreList = RSString.parse("You can(Wt add yourself to your own ignore list)3");
    static RSString HasPleaseRemove = RSString.parse("Please remove ");
    static RSString HasIgnoreToFriends = RSString.parse(" from your ignore list first)3");
    static RSString HasFriendsToIgnore = RSString.parse(" from your friend list first)3");
    static RSString HasFriendsAlready = RSString.parse(" is already on your friend list)3");
    static RSString HasIgnoreAlready = RSString.parse(" is already on your ignore list)3");
    static RSString HasWishToTrade = RSString.parse("wishes to trade with you)3");
    static RSString HasAttack = RSString.parse("Attack");
    static RSString HasUse = RSString.parse("Use");
    static RSString HasExamine = RSString.parse("Examine");
    static RSString HasTake = RSString.parse("Take");
    static RSString HasWalkHere = RSString.parse("Walk here");
    static RSString HasDrop = RSString.parse("Drop");
    static RSString HasDiscard = RSString.parse("Discard");
    static RSString HasHidden = RSString.parse("Hidden");
    static RSString HasNull = RSString.parse("null");
    static RSString HasCancel = RSString.parse("Cancel");
    static RSString HasFaceHere = RSString.parse("Face here");
    static RSString HasContinue = RSString.parse("Continue");
    static RSString HasClose = RSString.parse("Close");
    static RSString HasOK = RSString.parse("Ok");
    static RSString HasSelect = RSString.parse("Select");
    static RSString HasChooseOptions = RSString.parse("Choose Option");
    static RSString HasMoreOptions = RSString.parse(" more options");
    static RSString HasUnableFind = RSString.parse("Unable to find ");
    static RSString HasSkill = RSString.parse("skill: ");
    static RSString HasScroll = RSString.parse("scroll:");
    static RSString HasLevel = RSString.parse("level: ");
    static RSString HasRating = RSString.parse("rating: ");

    /**Money values (K (Thousand)), (M (Million))
     *
     */
    static RSString ThousandK = RSString.parse("K");
    static RSString MillionM = RSString.parse("M");


    static RSString HasDuelFriend = RSString.parse(":duelfriend:");
    static RSString HasDuelStake = RSString.parse(":duelstake:");
    static RSString HasTradeRequest = RSString.parse(":tradereq:");
    static RSString HasTrade = RSString.parse(":trade:");
    static RSString HasAssist = RSString.parse(":assist:");
    static RSString HasAssistRequest = RSString.parse(":assistreq:");
    static RSString HasClanRequest = RSString.parse(":clanreq:");
    static RSString HasClan = RSString.parse(":clan:");
    static RSString HasAllyReq = RSString.parse(":allyreq:");


    /**Archive Info for client cache lookup
     *
     */
    static RSString HasLabels = RSString.parse("_labels");
    static RSString HasPlayerLabels = RSString.parse("_labels");
    static RSString HasULLookUp = RSString.parse("ul");
    static RSString HasHuffman = RSString.parse("huffman");


    /**Colored Text Commands * For Color editing use ColorCore.java
     * *Note not used to actually change the color of text
     * Used as color coding commands such as:
     * red: purple: etc.
     */

    static RSString TextColorYellow = RSString.parse("yellow:");
    static RSString TextColorRed = RSString.parse("red:");
    static RSString TextColorGreen = RSString.parse("green:");
    static RSString TextColorCyan = RSString.parse("cyan:");
    static RSString TextColorPurple = RSString.parse("purple:");
    static RSString TextColorWhite = RSString.parse("white:");
    static RSString TextFlashOne = RSString.parse("flash1:");
    static RSString TextFlashTwo = RSString.parse("flash2:");
    static RSString TextFlashThree = RSString.parse("flash3:");
    static RSString TextGlowOne = RSString.parse("glow1:");
    static RSString TextGlowTwo = RSString.parse("glow2:");
    static RSString TextGlowThree = RSString.parse("glow3:");
    static RSString TextWave = RSString.parse("wave:");
    static RSString TextWaveTwo = RSString.parse("wave2:");
    static RSString TextShake = RSString.parse("shake:");
    static RSString TextSlide = RSString.parse("slide:");




    /**Months of the year
     * This was being accessed multiple times for other methods
     */
    static RSString[] MonthsOfTheYear = new RSString[]{RSString.parse("Jan"),
                                                       RSString.parse("Feb"),
                                                       RSString.parse("Mar"),
                                                       RSString.parse("Apr"),
                                                       RSString.parse("May"),
                                                       RSString.parse("Jun"),
                                                       RSString.parse("Jul"),
                                                       RSString.parse("Aug"),
                                                       RSString.parse("Sep"),
                                                       RSString.parse("Oct"),
                                                       RSString.parse("Nov"),
                                                       RSString.parse("Dec")};

    static RSString[] DaysOfTheWeek = new RSString[]{  RSString.parse("Sun"),
                                                       RSString.parse("Mon"),
                                                       RSString.parse("Tue"),
                                                       RSString.parse("Wed"),
                                                       RSString.parse("Thu"),
                                                       RSString.parse("Fri"),
                                                       RSString.parse("Sat")};


    /**Unsorted
     *
     */
    static RSString Memoryk = RSString.parse("k");
    static RSString Spacer = RSString.parse(" ");
    static RSString MembersObject = RSString.parse("Members object");

    /**Fonts
     *
     */
    static Font Helvetica = new Font("Helvetica", Font.BOLD, 13);
}
