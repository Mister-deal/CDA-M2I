const AlertValue = (props) => {
    return(
        <div className={props.bgColor ? "alert alert-" + props.bgColor: "alert alert-danger"} role="alert">
            <i className={props.icon ? "bi bi-" + props.icon: "bi bi-ban"}></i>
            <p>{props.label ? props.label: "un problème a été aperçu"}</p>
        </div>
    )
}
export default AlertValue