const AnyAlert = (props) => {
    const alertIcon = props.icon;
    return(
        <div style={{backgroundColor: props.bgColor ? props.bgColor: "red"}}>
            <i src={props.icon ? props.icon : alertIcon} alt="Alert"></i>
            <p>{props.label ? props.label : "un problème a été aperçu"}</p>
        </div>
    )
}
export default AnyAlert