@file:JsModule("react-router-dom")

package react.router.dom

import react.RClass
import react.RProps

external fun useHistory(): RouteResultHistory

external fun useLocation(): RouteResultLocation

@JsName("useParams")
external fun rawUseParams(): dynamic

@JsName("useRouteMatch")
external fun <T : RProps> rawUseRouteMatch(options: dynamic): RouteResultMatch<T>

@JsName("matchPath")
external fun <T : RProps> rawMatchPath(pathName: String,options: dynamic): RouteResultMatch<T>?

@JsName("withRouter")
external fun <T : RProps> rawWithRouter(component: dynamic): RClass<T>
