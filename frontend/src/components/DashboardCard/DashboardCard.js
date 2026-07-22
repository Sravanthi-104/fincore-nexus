    import "./DashboardCard.css";
    import { FaArrowUp } from "react-icons/fa";

    function DashboardCard({
        title,
        value,
        color,
        icon,
        trend = "+12%"
    }) {

        return (

            <div
                className="dashboard-card"
                style={{ borderTop: `5px solid ${color}` }}
            >

                <div className="card-header">

                    <div className="card-icon">
                        {icon}
                    </div>

                    <span className="trend">
                        <FaArrowUp />
                        {trend}
                    </span>

                </div>

                <h3>{title}</h3>

                <h1>{value}</h1>

            </div>

        );

    }

    export default DashboardCard;