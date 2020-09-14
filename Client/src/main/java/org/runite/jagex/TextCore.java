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
    static RSString RSLoadingPleaseWait = RSString.of(GameLaunch.SETTINGS.getName() + " is loading )2 please wait)3)3)3");
    static RSString LoadingConfig = RSString.of("Loading config )2 ");
    static RSString LoadedConfig = RSString.of("Loaded config");
    static RSString LoadingSprites = RSString.of("Loading sprites )2 ");
    static RSString LoadedSprites = RSString.of("Loaded sprites");
    static RSString LoadingWLD = RSString.of("Loading world list data");
    static RSString LoadedWLD = RSString.of("Loaded world list data");
    static RSString LoadingPleaseWait = RSString.of("Please wait)3)3)3");
    static RSString LoadingPleaseWait2 = RSString.of("Loading )2 please wait)3");
    static RSString LoadingFonts = RSString.of("Loading fonts )2 ");
    static RSString LoadedFonts = RSString.of("Loaded fonts");
    static RSString LoadedWordPack = RSString.of("Loaded wordpack");
    static RSString LoadingTextures = RSString.of("Loading textures )2 ");
    static RSString LoadedTextures = RSString.of("Loaded textures");
    static RSString LoadingInterfaces = RSString.of("Loading interfaces )2 ");
    static RSString LoadedInterfaces = RSString.of("Loaded interfaces");
    static RSString LoadingTitleScreen = RSString.of("Loading title screen )2 ");
    static RSString LoadingGeneral = RSString.of("Loading)3)3)3");
    static RSString LoadingWordPack = RSString.of("Loading wordpack )2 ");
    static RSString LoadingConnecting = RSString.of("Connecting.. This takes a LONG time.");
    static RSString LoadedUpdateList = RSString.of("Loaded update list");
    static RSString AttemptingReestablish = RSString.of("Please wait )2 attempting to reestablish)3");
    static RSString CreatedWorld = RSString.of("Created gameworld");
    static RSString CheckingForUpdates = RSString.of("Checking for updates )2 ");
    static RSString LoadedInputHandler = RSString.of("Loaded input handler");
    static RSString OpenedTitleScreen = RSString.of("Opened title screen");
    static RSString LoadedTitleScreen = RSString.of("Loaded title screen");
    static RSString Starting3DLibrary = RSString.of("Starting 3d Library");
    static RSString Started3DLibrary = RSString.of("Started 3d Library");
    static RSString AllocatingMemory = RSString.of("Allocating memory");
    static RSString AllocatedMemory = RSString.of("Allocated memory");
    static RSString PreparedSoundEngine = RSString.of("Prepared sound engine");
    static RSString ConxLost = RSString.of("Connection lost)3");
    static RSString ConxUpdateServer = RSString.of("Connected to update server");

    /**User Login/ User Text
     *
     */
    static RSString HasExpires = RSString.of("; Expires=");
    static RSString HasMaxAge = RSString.of("; Max)2Age=");
    static RSString HasAgeExpire = RSString.of("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
    static RSString HasLoggedIn = RSString.of(" has logged in)3");
    static RSString HasLoggedOut = RSString.of(" has logged out)3");
    static RSString HasFriendsListFull = RSString.of("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");
    static RSString HasIgnoreListFull = RSString.of("Your ignore list is full)3 Max of 100 users)3");
    static RSString HasOnOwnFriendsList = RSString.of("You can(Wt add yourself to your own friend list)3");
    static RSString HasOnOwnIgnoreList = RSString.of("You can(Wt add yourself to your own ignore list)3");
    static RSString HasPleaseRemove = RSString.of("Please remove ");
    static RSString HasIgnoreToFriends = RSString.of(" from your ignore list first)3");
    static RSString HasFriendsToIgnore = RSString.of(" from your friend list first)3");
    static RSString HasFriendsAlready = RSString.of(" is already on your friend list)3");
    static RSString HasIgnoreAlready = RSString.of(" is already on your ignore list)3");
    static RSString HasWishToTrade = RSString.of("wishes to trade with you)3");
    static RSString HasAttack = RSString.of("Attack");
    static RSString HasUse = RSString.of("Use");
    static RSString HasExamine = RSString.of("Examine");
    static RSString HasTake = RSString.of("Take");
    static RSString HasWalkHere = RSString.of("Walk here");
    static RSString HasDrop = RSString.of("Drop");
    static RSString HasDiscard = RSString.of("Discard");
    static RSString HasHidden = RSString.of("Hidden");
    static RSString HasNull = RSString.of("null");
    static RSString HasCancel = RSString.of("Cancel");
    static RSString HasFaceHere = RSString.of("Face here");
    static RSString HasContinue = RSString.of("Continue");
    static RSString HasClose = RSString.of("Close");
    static RSString HasOK = RSString.of("Ok");
    static RSString HasSelect = RSString.of("Select");
    static RSString HasChooseOptions = RSString.of("Choose Option");
    static RSString HasMoreOptions = RSString.of(" more options");
    static RSString HasUnableFind = RSString.of("Unable to find ");
    static RSString HasSkill = RSString.of("skill: ");
    static RSString HasScroll = RSString.of("scroll:");
    static RSString HasLevel = RSString.of("level: ");
    static RSString HasRating = RSString.of("rating: ");

    /**Money values (K (Thousand)), (M (Million))
     *
     */
    static RSString ThousandK = RSString.of("K");
    static RSString MillionM = RSString.of("M");


    static RSString HasDuelFriend = RSString.of(":duelfriend:");
    static RSString HasDuelStake = RSString.of(":duelstake:");
    static RSString HasTradeRequest = RSString.of(":tradereq:");
    static RSString HasTrade = RSString.of(":trade:");
    static RSString HasAssist = RSString.of(":assist:");
    static RSString HasAssistRequest = RSString.of(":assistreq:");
    static RSString HasClanRequest = RSString.of(":clanreq:");
    static RSString HasClan = RSString.of(":clan:");
    static RSString HasAllyReq = RSString.of(":allyreq:");


    /**Archive Info for client cache lookup
     *
     */
    static RSString HasLabels = RSString.of("_labels");
    static RSString HasPlayerLabels = RSString.of("_labels");
    static RSString HasULLookUp = RSString.of("ul");
    static RSString HasHuffman = RSString.of("huffman");


    /**Colored Text Commands * For Color editing use ColorCore.java
     * *Note not used to actually change the color of text
     * Used as color coding commands such as:
     * red: purple: etc.
     */

    static RSString TextColorYellow = RSString.of("yellow:");
    static RSString TextColorRed = RSString.of("red:");
    static RSString TextColorGreen = RSString.of("green:");
    static RSString TextColorCyan = RSString.of("cyan:");
    static RSString TextColorPurple = RSString.of("purple:");
    static RSString TextColorWhite = RSString.of("white:");
    static RSString TextFlashOne = RSString.of("flash1:");
    static RSString TextFlashTwo = RSString.of("flash2:");
    static RSString TextFlashThree = RSString.of("flash3:");
    static RSString TextGlowOne = RSString.of("glow1:");
    static RSString TextGlowTwo = RSString.of("glow2:");
    static RSString TextGlowThree = RSString.of("glow3:");
    static RSString TextWave = RSString.of("wave:");
    static RSString TextWaveTwo = RSString.of("wave2:");
    static RSString TextShake = RSString.of("shake:");
    static RSString TextSlide = RSString.of("slide:");




    /**Months of the year
     * This was being accessed multiple times for other methods
     */
    static RSString[] MonthsOfTheYear = new RSString[]{RSString.of("Jan"),
                                                       RSString.of("Feb"),
                                                       RSString.of("Mar"),
                                                       RSString.of("Apr"),
                                                       RSString.of("May"),
                                                       RSString.of("Jun"),
                                                       RSString.of("Jul"),
                                                       RSString.of("Aug"),
                                                       RSString.of("Sep"),
                                                       RSString.of("Oct"),
                                                       RSString.of("Nov"),
                                                       RSString.of("Dec")};

    static RSString[] DaysOfTheWeek = new RSString[]{  RSString.of("Sun"),
                                                       RSString.of("Mon"),
                                                       RSString.of("Tue"),
                                                       RSString.of("Wed"),
                                                       RSString.of("Thu"),
                                                       RSString.of("Fri"),
                                                       RSString.of("Sat")};


    /**Unsorted
     *
     */
    static RSString Memoryk = RSString.of("k");
    static RSString Spacer = RSString.of(" ");
    static RSString MembersObject = RSString.of("Members object");

    /**Fonts
     *
     */
    static Font Helvetica = new Font("Helvetica", Font.BOLD, 13);
}
