import React from "react";

const RenderTable = ({contacts}) => {
    if(contacts.length === 0){
        return <p>Aucun contact disponible.</p>
    }
    return(
        <table>
            <thead>
                <tr>
                    <th>Mail</th>
                </tr>
            </thead>
            <tbody>
                {contacts.map((contact, index) => (
                    <tr key={index}>
                        <td>{contact.mail}</td>
                    </tr>
                ))}
            </tbody>
        </table>
    )
}

export default RenderTable