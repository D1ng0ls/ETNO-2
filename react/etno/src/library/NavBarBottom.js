import React from 'react'

export function NavBarBottom() {
    return(
        <div className="pagination">
            <a href="#">
                <i className="bi bi-caret-left-fill"></i>
            </a>
            <a href="#" className="active">1</a>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#">
                <i className="bi bi-caret-right-fill"></i>
            </a>
        </div>
    )
}