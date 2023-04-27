package cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app

data class Item(
    val ad_info: cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app.AdInfo?,
    val args: cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app.Args,
    val can_play: Int,
    val card_goto: String,
    val bvid: String?,
    val card_type: String,
    val cover: String?,
    val cover_left_1_content_description: String,
    val cover_left_2_content_description: String,
    val cover_left_icon_1: Int,
    val cover_left_icon_2: Int,
    val cover_left_text_1: String?,
    val cover_left_text_2: String,
    val cover_right_content_description: String,
    val cover_right_text: String,
    val desc: String?,
    val desc_button: cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app.DescButton?,
    val goto: String,
    val cover_badge: String?,
    val goto_icon: cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app.GotoIcon?,
    val idx: Int,
    val official_icon: Int?,
    val `param`: String?,
    val player_args: cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app.PlayerArgs?,
    val rcmd_reason: String?,
    val rcmd_reason_style: cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app.RcmdReasonStyle?,
    val talk_back: String?,
    val three_point: cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app.ThreePoint,
    val three_point_v2: List<cn.spacexc.wearbili.remake.app.main.recommend.domain.remote.rcmd.app.ThreePointV2>,
    val title: String,
    val track_id: String,
    val uri: String,
    val badge: String?
)