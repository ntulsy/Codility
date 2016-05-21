using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using PolygonConcavityIndex;

namespace Codility.Test
{
    [TestClass]
    public class PolygonConcavityIndexTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            List<Point2D> A = new List<Point2D>();
            A.Add(new Point2D { x = -1, y = 3 });
            A.Add(new Point2D { x = 3, y = 1 });
            A.Add(new Point2D { x = 0, y = -1 });
            A.Add(new Point2D { x = -2, y = 1 });
            int result = s.solution(A.ToArray());
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            List<Point2D> A = new List<Point2D>();
            A.Add(new Point2D { x = 1, y = 1 });
            A.Add(new Point2D { x = 2, y = 2 });
            A.Add(new Point2D { x = 3, y = 3 });
            int result = s.solution(A.ToArray());
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            List<Point2D> A = new List<Point2D>();
            A.Add(new Point2D { x = 0, y = 0 });
            A.Add(new Point2D { x = 2, y = 0 });
            A.Add(new Point2D { x = 3, y = 1 });
            A.Add(new Point2D { x = 2, y = 2 });
            A.Add(new Point2D { x = 0, y = 2 });
            int result = s.solution(A.ToArray());
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            List<Point2D> A = new List<Point2D>();
            A.Add(new Point2D { x = 0, y = 0 });
            A.Add(new Point2D { x = 2, y = 0 });
            A.Add(new Point2D { x = 3, y = 1 });
            A.Add(new Point2D { x = 2, y = 2 });
            A.Add(new Point2D { x = 0, y = 2 });
            A.Add(new Point2D { x = 1, y = 1 });
            int result = s.solution(A.ToArray());
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            List<Point2D> A = new List<Point2D>();
            A.Add(new Point2D { x = 0, y = 0 });
            A.Add(new Point2D { x = 0, y = 3 });
            A.Add(new Point2D { x = 3, y = 3 });
            A.Add(new Point2D { x = 3, y = 0 });
            int result = s.solution(A.ToArray());
            Assert.AreEqual(-1, result);
        }
    }
}
