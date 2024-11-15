import React from 'react'
export function Button(name,texto, url) {
    return(
        <div className={name + "-botao botao"}>
            <a
                href={url}>
                <button className={"btn-link bt-"+name}>
                    {texto}
                </button>
            </a>
        </div>
    )
}