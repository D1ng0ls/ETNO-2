import React from 'react'
export function Titulo(sect, title) {
    return(
        <div className={sect+"-titulo title"}>
            <h2>{title}</h2>
        </div>
    )
}